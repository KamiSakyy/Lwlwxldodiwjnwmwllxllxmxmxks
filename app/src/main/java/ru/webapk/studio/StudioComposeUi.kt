package ru.webapk.studio

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** State bridge keeps the existing Java import/build pipeline independent from Compose UI. */
class StudioComposeUi(private val activity: MainActivity) {
    private var appName by mutableStateOf("Мой сайт")
    private var packageId by mutableStateOf("com.example.mysite")
    private var versionCode by mutableStateOf(
        nextVersion(activity.getPreferences(Context.MODE_PRIVATE)
            .getInt("target_version_com.example.mysite", 0))
    )
    private var autoRotate by mutableStateOf(
        activity.getPreferences(Context.MODE_PRIVATE).getBoolean("auto_rotate", false)
    )
    private var projectSummaryState by mutableStateOf("Файл ещё не выбран")
    private var iconSummary by mutableStateOf("Иконка по умолчанию")
    private var iconBitmap by mutableStateOf<Bitmap?>(
        BitmapFactory.decodeResource(activity.resources, R.mipmap.ic_launcher)
    )
    private var statusMessage by mutableStateOf("")
    private var isBusy by mutableStateOf(false)
    private var canSave by mutableStateOf(false)
    private var packageErrorState by mutableStateOf<String?>(null)
    private var versionErrorState by mutableStateOf<String?>(null)

    fun install(view: ComposeView) {
        view.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
        view.setContent {
            MaterialTheme(colorScheme = studioColorScheme) {
                StudioScreen()
            }
        }
    }

    fun getAppNameValue(): String = appName
    fun getPackageIdValue(): String = packageId
    fun getVersionCodeValue(): String = versionCode
    fun getAutoRotateValue(): Boolean = autoRotate

    fun setAppNameValue(value: String) {
        appName = value.take(40)
    }

    fun setPackageIdValue(value: String) {
        packageId = value.take(127)
    }

    fun setVersionCodeValue(value: String) {
        versionCode = value.take(10)
    }

    fun setAutoRotateValue(value: Boolean) {
        autoRotate = value
        activity.getPreferences(Context.MODE_PRIVATE).edit().putBoolean("auto_rotate", value).apply()
    }

    fun setProjectSummary(value: String) {
        projectSummaryState = value
    }

    fun setIcon(bitmap: Bitmap?, summary: String) {
        iconBitmap = bitmap
        iconSummary = summary
    }

    fun setStatus(message: String, busy: Boolean) {
        statusMessage = message
        isBusy = busy
    }

    fun setSaveAvailable(available: Boolean) {
        canSave = available
    }

    fun setPackageError(message: String?) {
        packageErrorState = message
    }

    fun setVersionError(message: String?) {
        versionErrorState = message
    }

    @Composable
    private fun StudioScreen() {
        Surface(modifier = Modifier.fillMaxSize(), color = Background) {
            Column(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .windowInsetsPadding(
                            WindowInsets.safeDrawing.only(
                                WindowInsetsSides.Top + WindowInsetsSides.Horizontal
                            )
                        )
                        .verticalScroll(rememberScrollState())
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(0.dp)
                ) {
                    SectionCard(title = "Проект", subtitle = "Выберите HTML-файл или ZIP-архив сайта.") {
                        androidx.compose.material3.Text(
                            text = projectSummaryState,
                            color = Muted,
                            fontSize = 13.sp,
                            lineHeight = 18.sp
                        )
                        Spacer(Modifier.height(10.dp))
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            OutlinedButton(
                                onClick = { activity.openHtmlPicker() },
                                enabled = !isBusy,
                                modifier = Modifier.weight(1f).height(46.dp),
                                shape = RoundedCornerShape(14.dp),
                                border = BorderStroke(1.dp, Outline),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = Ink)
                            ) {
                                androidx.compose.material3.Text("HTML-файл", fontSize = 13.sp)
                            }
                            OutlinedButton(
                                onClick = { activity.openZipPicker() },
                                enabled = !isBusy,
                                modifier = Modifier.weight(1f).height(46.dp),
                                shape = RoundedCornerShape(14.dp),
                                border = BorderStroke(1.dp, Outline),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = Ink)
                            ) {
                                androidx.compose.material3.Text("ZIP-проект", fontSize = 13.sp)
                            }
                        }
                    }

                    SectionCard(title = "Приложение") {
                        StudioTextField(
                            label = "Название приложения",
                            value = appName,
                            onValueChange = {
                                appName = it.take(40)
                            },
                            placeholder = "Например, Мой сайт",
                            keyboardType = KeyboardType.Text,
                            isError = false
                        )
                        Spacer(Modifier.height(8.dp))
                        StudioTextField(
                            label = "Package ID",
                            value = packageId,
                            onValueChange = {
                                packageId = it.take(127)
                                packageErrorState = null
                            },
                            placeholder = "com.company.mysite",
                            keyboardType = KeyboardType.Ascii,
                            isError = packageErrorState != null,
                            monospace = true
                        )
                        if (packageErrorState != null) {
                            androidx.compose.material3.Text(
                                text = packageErrorState.orEmpty(),
                                color = Error,
                                fontSize = 12.sp,
                                modifier = Modifier.padding(start = 12.dp, top = 4.dp)
                            )
                        }
                        Spacer(Modifier.height(8.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(0.39f)) {
                                FieldLabel("Версия")
                                CompactVersionField(
                                    value = versionCode,
                                    isError = versionErrorState != null,
                                    onValueChange = {
                                        versionCode = it.take(10).filter(Char::isDigit)
                                        versionErrorState = null
                                    }
                                )
                            }
                            Spacer(Modifier.size(8.dp))
                            Surface(
                                modifier = Modifier.weight(0.61f).height(54.dp),
                                shape = RoundedCornerShape(13.dp),
                                color = Field,
                                border = BorderStroke(1.dp, Outline)
                            ) {
                                Row(
                                    modifier = Modifier.padding(start = 10.dp, end = 6.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    androidx.compose.material3.Text(
                                        text = "Автоповорот",
                                        color = Ink,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Medium,
                                        modifier = Modifier.weight(1f)
                                    )
                                    Switch(
                                        checked = autoRotate,
                                        onCheckedChange = { setAutoRotateValue(it) }
                                    )
                                }
                            }
                        }
                        if (versionErrorState != null) {
                            androidx.compose.material3.Text(
                                text = versionErrorState.orEmpty(),
                                color = Error,
                                fontSize = 12.sp,
                                modifier = Modifier.padding(start = 4.dp, top = 3.dp)
                            )
                        }
                        Spacer(Modifier.height(11.dp))
                        HorizontalDivider(color = Outline.copy(alpha = 0.8f), thickness = 1.dp)
                        Spacer(Modifier.height(10.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(52.dp)
                                    .clip(RoundedCornerShape(13.dp))
                                    .background(Raised)
                                    .border(1.dp, Outline, RoundedCornerShape(13.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                iconBitmap?.let { bitmap ->
                                    Image(
                                        bitmap = bitmap.asImageBitmap(),
                                        contentDescription = "Иконка приложения",
                                        modifier = Modifier.fillMaxSize().padding(1.dp),
                                        contentScale = ContentScale.Crop
                                    )
                                }
                            }
                            Spacer(Modifier.size(10.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                androidx.compose.material3.Text(
                                    text = iconSummary,
                                    color = Ink,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    lineHeight = 17.sp
                                )
                                Spacer(Modifier.height(2.dp))
                                androidx.compose.material3.Text(
                                    text = "PNG или JPG",
                                    color = Muted,
                                    fontSize = 11.sp
                                )
                            }
                            Spacer(Modifier.size(6.dp))
                            OutlinedButton(
                                onClick = { activity.openIconPicker() },
                                enabled = !isBusy,
                                modifier = Modifier.widthIn(min = 76.dp).height(42.dp),
                                shape = RoundedCornerShape(13.dp),
                                border = BorderStroke(1.dp, Outline),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = Ink),
                                contentPadding = androidx.compose.foundation.layout.PaddingValues(horizontal = 10.dp)
                            ) {
                                androidx.compose.material3.Text("Выбрать", fontSize = 12.sp)
                            }
                        }
                    }
                }

                BottomActions()
            }
        }
    }

    @Composable
    private fun BottomActions() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .windowInsetsPadding(
                    WindowInsets.navigationBars.only(
                        WindowInsetsSides.Bottom + WindowInsetsSides.Horizontal
                    )
                )
                .imePadding()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            HorizontalDivider(color = Outline, thickness = 1.dp)
            if (statusMessage.isNotEmpty()) {
                androidx.compose.material3.Text(
                    text = statusMessage,
                    color = if (isBusy) Primary else Muted,
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    modifier = Modifier.padding(top = 7.dp, bottom = 7.dp)
                )
            } else {
                Spacer(Modifier.height(7.dp))
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(
                    onClick = { activity.buildApk() },
                    enabled = !isBusy,
                    modifier = Modifier.weight(1f).height(50.dp),
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Primary,
                        contentColor = PrimaryText,
                        disabledContainerColor = Raised,
                        disabledContentColor = Muted
                    )
                ) {
                    androidx.compose.material3.Text(
                        text = if (isBusy) "Подождите…" else "Собрать APK",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                if (canSave) {
                    OutlinedButton(
                        onClick = { activity.chooseSaveLocation() },
                        enabled = !isBusy,
                        modifier = Modifier.weight(1f).height(50.dp),
                        shape = RoundedCornerShape(15.dp),
                        border = BorderStroke(1.dp, Outline),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Ink)
                    ) {
                        androidx.compose.material3.Text(
                            text = "Сохранить",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }

    @Composable
    private fun SectionCard(
        title: String,
        subtitle: String? = null,
        content: @Composable ColumnScope.() -> Unit
    ) {
        Card(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            shape = RoundedCornerShape(17.dp),
            colors = CardDefaults.cardColors(containerColor = CardSurface),
            border = BorderStroke(1.dp, Outline)
        ) {
            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 13.dp, vertical = 12.dp)) {
                androidx.compose.material3.Text(
                    text = title,
                    color = Ink,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
                if (subtitle != null) {
                    Spacer(Modifier.height(2.dp))
                    androidx.compose.material3.Text(
                        text = subtitle,
                        color = Muted,
                        fontSize = 12.sp,
                        lineHeight = 16.sp
                    )
                    Spacer(Modifier.height(9.dp))
                } else {
                    Spacer(Modifier.height(9.dp))
                }
                content()
            }
        }
    }

    @Composable
    private fun FieldLabel(label: String) {
        androidx.compose.material3.Text(
            text = label,
            color = Muted,
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 4.dp)
        )
    }

    @Composable
    private fun StudioTextField(
        label: String,
        value: String,
        onValueChange: (String) -> Unit,
        placeholder: String,
        keyboardType: KeyboardType,
        isError: Boolean,
        monospace: Boolean = false
    ) {
        Column {
            FieldLabel(label)
            OutlinedTextField(
                value = value,
                onValueChange = onValueChange,
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                isError = isError,
                placeholder = {
                    androidx.compose.material3.Text(
                        text = placeholder,
                        color = Muted,
                        fontSize = 14.sp
                    )
                },
                textStyle = TextStyle(
                    fontSize = if (monospace) 13.sp else 14.sp,
                    fontFamily = if (monospace) FontFamily.Monospace else FontFamily.Default,
                    color = Ink
                ),
                keyboardOptions = KeyboardOptions(
                    keyboardType = keyboardType,
                    imeAction = ImeAction.Next
                ),
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Ink,
                    unfocusedTextColor = Ink,
                    focusedBorderColor = if (isError) Error else Primary,
                    unfocusedBorderColor = if (isError) Error else Outline,
                    focusedContainerColor = Field,
                    unfocusedContainerColor = Field,
                    errorBorderColor = Error,
                    errorContainerColor = Field,
                    cursorColor = Primary,
                    focusedPlaceholderColor = Muted,
                    unfocusedPlaceholderColor = Muted
                )
            )
        }
    }

    private fun nextVersion(previous: Int): String =
        if (previous == Int.MAX_VALUE) Int.MAX_VALUE.toString() else maxOf(1, previous + 1).toString()

    @Composable
    private fun CompactVersionField(
        value: String,
        isError: Boolean,
        onValueChange: (String) -> Unit
    ) {
        Surface(
            modifier = Modifier.fillMaxWidth().height(52.dp),
            shape = RoundedCornerShape(12.dp),
            color = Field,
            border = BorderStroke(1.dp, if (isError) Error else Outline)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 11.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                if (value.isEmpty()) {
                    androidx.compose.material3.Text("1", color = Muted, fontSize = 14.sp)
                }
                BasicTextField(
                    value = value,
                    onValueChange = onValueChange,
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    textStyle = TextStyle(fontSize = 14.sp, color = Ink),
                    cursorBrush = SolidColor(Primary),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Done
                    )
                )
            }
        }
    }

    private companion object {
        val Background = Color(0xFF101114)
        val CardSurface = Color(0xFF191B1F)
        val Raised = Color(0xFF212429)
        val Field = Color(0xFF131519)
        val Outline = Color(0xFF3B3F46)
        val Ink = Color(0xFFF1F2F4)
        val Muted = Color(0xFFB2B6BE)
        val Primary = Color(0xFF8AB4F8)
        val PrimaryText = Color(0xFF101317)
        val Error = Color(0xFFFFB4AB)
        val studioColorScheme = darkColorScheme(
            primary = Primary,
            onPrimary = PrimaryText,
            secondary = Primary,
            onSecondary = PrimaryText,
            background = Background,
            onBackground = Ink,
            surface = CardSurface,
            onSurface = Ink,
            surfaceVariant = Raised,
            onSurfaceVariant = Muted,
            outline = Outline,
            outlineVariant = Outline
        )
    }
}
