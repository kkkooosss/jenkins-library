def call() {
    sh """
        echo this is Preparation stage 000.
        export var_00=12222
        export var_01=22222
        export var_02=32222
        echo \${var_00}
        echo \${var_01}
        echo \${var_02}
    """
}