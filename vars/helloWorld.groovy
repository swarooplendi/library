def call(Map config = [:]) {
    sh " Hello ${config.person}. Today your meeting is fixed with ${config.master}."
}
