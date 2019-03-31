package ivorytower.co.`in`.retrofit

import io.reactivex.Observable
import ivorytower.co.`in`.model.UserModel
import retrofit2.http.GET

interface APIInterface {
    @GET("/albums")
    fun getUsers():  Observable<ArrayList<UserModel>>
}