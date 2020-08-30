package restClient;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class RestClientExample {
	private static String uri = "http://localhost:8185/staff";
	private static ClientConfig clientConfig;
	private static Client client;
	private static WebResource resource;
	public static void main(String[] args) {
		clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);
		client = Client.create(clientConfig);
		resource = client.resource(uri);
		// you can use any method between both of them (getAllData or postData)
		 getAllData();
		// postData();
	}
	public static void getAllData() {
		try {
			ClientResponse response = resource.type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			if (response.getStatus() == 200) {
				ArrayList<Staff> list = response.getEntity(new GenericType<ArrayList<Staff>>() {});
				for (Staff staff : list) System.out.println(staff);
			}
		} catch (Exception e) { System.out.println("Exception is:" + e.getMessage()); }
	}
	public static void postData() {
		Staff staff = new Staff();
		staff.setStaffname("Celal"); 				staff.setStafflastname("Aygar");
		staff.setEmail("celal.aygar@gmail.com"); 	staff.setGender("Male");
		staff.setCity("DENIZLI");
		try {
			ClientResponse response = resource.type(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
					.post(ClientResponse.class, staff);
			if (response.getStatus() == 200) System.out.println("Staff detail : " + response.getEntity(Staff.class));
		} catch (Exception e) { System.out.println("Exception is:" + e.getMessage()); }
	}
}
