package ivorytower.co.`in`.model
import com.google.gson.annotations.SerializedName


data class UserModel(
    @SerializedName("id")
    var id: Int?,
    @SerializedName("title")
    var title: String?,
    @SerializedName("userId")
    var userId: Int?
)