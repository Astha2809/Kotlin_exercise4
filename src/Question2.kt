fun main(args: Array<String>) {
    var Employee_list: MutableMap<String, Int> = mutableMapOf()
    Employee_list.put("Employee1", 24)
    Employee_list.put("Employee2", 32)
    Employee_list.put("Employee3", 30)
    Employee_list.put("Employee4", 28)
    Employee_list.put("Employee6", 36)

    val new_list = Employee_list.filterValues { it > 30 }
    println(new_list)
}
