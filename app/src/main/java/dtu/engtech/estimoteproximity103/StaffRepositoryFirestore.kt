package dtu.engtech.estimoteproximity103

import android.util.Log
import androidx.compose.runtime.toMutableStateList
import com.google.firebase.firestore.FirebaseFirestore
import dtu.engtech.estimoteproximity103.core.Constants

class StaffRepositoryFirestore: StaffRepository {
    var staff = mutableListOf<Staff>().toMutableStateList()

    override fun getStaff() {
        FirebaseFirestore.getInstance().collection(Constants.STAFF)
            .addSnapshotListener { snapshot, e ->
                if (e != null) {
                    Log.w(Constants.FIREBASETAG, "Listen failed.", e)
                    //return@addSnapshotListener
                }

                if (snapshot != null) {
                    staff = snapshot.toObjects(Staff::class.java).toMutableStateList()
                    Log.d(Constants.FIREBASETAG, "Current data size: ${staff.size}")
                    logStaff()

                } else {
                    Log.d(Constants.FIREBASETAG, "Current data: null")
                }
            }
    }

    fun logStaff(){
        for(staffMember in staff) {
            Log.d(Constants.FIREBASETAG, "Member: $staffMember")
        }
    }
}