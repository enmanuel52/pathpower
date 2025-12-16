package com.enmanuelbergling.pathpower.model

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.ui.graphics.Shape
import com.enmanuelbergling.pathpower.canvas.WaveColor
import com.enmanuelbergling.pathpower.canvas.WaveColor.Companion.DefaultBackWaveColor
import com.enmanuelbergling.pathpower.canvas.WaveColor.Companion.DefaultFrontWaveColor
import com.enmanuelbergling.pathpower.shaders.artisticPlasma
import com.enmanuelbergling.pathpower.shaders.goldenShader
import com.enmanuelbergling.pathpower.shaders.hotPlasma
import com.enmanuelbergling.pathpower.shaders.plasmaShader
import com.enmanuelbergling.pathpower.shape.Heart
import com.enmanuelbergling.pathpower.shape.Hexagon
import com.enmanuelbergling.pathpower.shape.Stain
import com.enmanuelbergling.pathpower.shape.Star
import com.enmanuelbergling.pathpower.shape.WaterDrop

/**
 * Defines the waves container
 * */
@RequiresApi(Build.VERSION_CODES.TIRAMISU)
enum class Glass(
    val shape: Shape,
    val backWaveColor: WaveColor,
    val frontWaveColor: WaveColor,
) {
    SimpleWaterDrop(
        WaterDrop,
        DefaultBackWaveColor,
        DefaultFrontWaveColor,
    ),
    LavaHexagon(
        Hexagon,
        WaveColor.Shader.Animated(goldenShader(0.45f)),
        WaveColor.Shader.Animated(goldenShader()),
    ),
    ColorfulStain(
        Stain(),
        WaveColor.Shader.Animated(artisticPlasma(0.45f)),
        WaveColor.Shader.Animated(artisticPlasma()),
    ),
    ColorfulHeart(
        Heart,
        WaveColor.Shader.Animated(plasmaShader(0.45f)),
        WaveColor.Shader.Animated(plasmaShader()),
    ),
    HotStar(
        Star,
        WaveColor.Shader.Animated(hotPlasma(0.45f)),
        WaveColor.Shader.Animated(hotPlasma()),
    )
}