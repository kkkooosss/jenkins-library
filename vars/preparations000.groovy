def call() {
    if (env.var_00 == "000") {
        sh """
            echo this is Preparation stage 000.
            export var_01=10000
            export var_02=20000
            export var_03=30000
            echo \${var_01}
            echo \${var_02}
            echo \${var_03}
        """
    } else if (env.var_00 == "111") {
        sh """
            echo this is Preparation stage 111.
            export var_01=11111
            export var_02=21111
            export var_03=31111
            echo \${var_01}
            echo \${var_02}
            echo \${var_03}
        """
    } else if (env.var_00 == "222") {
        sh """
            echo this is Preparation stage 222.
            export var_01=12222
            export var_02=22222
            export var_03=32222
            echo \${var_01}
            echo \${var_02}
            echo \${var_03}
        """
    } else {
        sh "echo *******ERROR******"
    }
}
