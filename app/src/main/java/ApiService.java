import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface ApiService {
    @GET("mockapi/bahasa_pemrograman")
    Call<ProgrammingResponse> getJava(@Path("id") String id) {

    }
}
