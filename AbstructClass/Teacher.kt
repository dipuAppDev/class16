package AbstructClass

class Teacher(name:String) : Person(name) {
    override fun personJob() {
       println("Teacher")
    }
}