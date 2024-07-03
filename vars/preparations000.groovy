def call() {
    sh """
        echo this is Preparation stage 000.
        export var_00=10000
        export var_01=20000
        export var_02=30000
        echo \${var_00}
        echo \${var_01}
        echo \${var_02}
    """
}
