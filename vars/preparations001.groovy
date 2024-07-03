def call() {
    sh """
        echo this is Preparation stage 000.
        export var_00=11111
        export var_01=21111
        export var_02=31111
        echo \${var_00}
        echo \${var_01}
        echo \${var_02}
    """
}
