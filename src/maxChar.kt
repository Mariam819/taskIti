fun String.MaxChar(){
    this.filter {
        it in this
    }.groupBy { it }.count()

}

