package dtu.engtech.estimoteproximity103

import android.util.Log
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import dtu.engtech.estimoteproximity103.core.Constants



class StaffViewModel : ViewModel() {
    //var staffRepository = StaffRepositoryMock()
    var staffRepository = StaffRepositoryFirestore()

    private var _staff = staffRepository.staff.toMutableStateList()
    val staff: List<Staff>
        get() = _staff

    init {
        staffRepository.getStaff()
    }

    fun addStaff(){
        staffRepository.staff.add(Staff("Joe Tester", "V2.02"))
    }
}

