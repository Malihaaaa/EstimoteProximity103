package dtu.engtech.estimoteproximity103

import androidx.compose.runtime.toMutableStateList

class StaffRepositoryMock: StaffRepository {
    var staff = mutableListOf<Staff>().toMutableStateList()

    override fun getStaff() {
        staff = StaffData.staffSample.toMutableStateList()
    }
}

