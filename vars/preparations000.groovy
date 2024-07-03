def call() {
    if (env.var_00 == "000") {
        env.var_01 = "10000"
        env.var_02 = "20000"
        env.var_03 = "30000"
    } else if (env.var_00 == "111") {
        env.var_01 = "11111"
        env.var_02 = "21111"
        env.var_03 = "31111"
    } else if (env.var_00 == "222") {
        env.var_01 = "12222"
        env.var_02 = "22222"
        env.var_03 = "32222"
    } else {
        error "Invalid value for var_00: ${env.var_00}"
    }
}
