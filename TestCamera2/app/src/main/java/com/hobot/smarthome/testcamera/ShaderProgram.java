package com.hobot.smarthome.testcamera;

import android.content.Context;

import static android.opengl.GLES20.glUseProgram;

/**
 * Created by liwentian on 17/6/22.
 */

public class ShaderProgram {

    protected final int program;

    protected ShaderProgram(Context context, int vertexId, int fragId) {
        program = ShaderHelper.buildProgram(ResourceUtils.readText(context, vertexId),
                ResourceUtils.readText(context, fragId));
    }

    public void useProgram() {
        glUseProgram(program);
    }
}