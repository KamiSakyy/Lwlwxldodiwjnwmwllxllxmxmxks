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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.TextButton
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
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
    private val preferences = activity.getPreferences(Context.MODE_PRIVATE)
    private val initialPackageId = preferences.getString("draft_package_id", "com.example.mysite")
        ?: "com.example.mysite"
    private var appName by mutableStateOf(preferences.getString("draft_app_name", "Мой сайт") ?: "Мой сайт")
    private var packageId by mutableStateOf(initialPackageId)
    private var versionCode by mutableStateOf(
        preferences.getString("draft_version_code", null)
            ?: nextVersion(preferences.getInt("target_version_$initialPackageId", 0))
    )
    private var autoRotate by mutableStateOf(preferences.getBoolean("auto_rotate", false))
    private var fullscreen by mutableStateOf(preferences.getBoolean("fullscreen", false))
    private var projectSummaryState by mutableStateOf(
        preferences.getString("draft_project_summary", "Файл ещё не выбран") ?: "Файл ещё не выбран"
    )
    private var iconSummary by mutableStateOf("Иконка по умолчанию")
    private var iconBitmap by mutableStateOf<Bitmap?>(
        BitmapFactory.decodeResource(activity.resources, R.drawable.site_default_icon)
    )
    private var statusMessage by mutableStateOf("")
    private var isBusy by mutableStateOf(false)
    private var canSave by mutableStateOf(false)
    private var buildProgress by mutableStateOf(0f)
    private var buildProgressMessage by mutableStateOf("")
    private var pythonRuntimeSelected by mutableStateOf(preferences.getBoolean("python_server_mode", false))
    private var pythonProjectSummaryState by mutableStateOf(
        preferences.getString("draft_python_project_summary", "Python-проект не выбран") ?: "Python-проект не выбран"
    )
    private var packageErrorState by mutableStateOf<String?>(null)
    private var versionErrorState by mutableStateOf<String?>(null)
    private val projectReady: Boolean
        get() = if (pythonRuntimeSelected) pythonProjectSummaryState != "Python-проект не выбран"
        else projectSummaryState != "Файл ещё не выбран"

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
    fun getFullscreenValue(): Boolean = fullscreen
    fun getProjectSummaryValue(): String = projectSummaryState
    fun getPythonProjectSummaryValue(): String = pythonProjectSummaryState
    fun getPythonServerMode(): Boolean = pythonRuntimeSelected

    fun setPythonServerMode(value: Boolean) {
        if (pythonRuntimeSelected == value || isBusy) return
        pythonRuntimeSelected = value
        preferences.edit().putBoolean("python_server_mode", value).apply()
        canSave = false
        statusMessage = if (value) "Импортируемый Python/Flask режим выбран" else "Режим статического сайта выбран"
    }

    fun setPythonProjectSummary(value: String) {
        pythonProjectSummaryState = value
        preferences.edit().putString("draft_python_project_summary", value).apply()
        canSave = false
    }

    fun setAppNameValue(value: String) {
        appName = value.take(40)
        preferences.edit().putString("draft_app_name", appName).apply()
    }

    fun setPackageIdValue(value: String) {
        packageId = value.take(127)
        preferences.edit().putString("draft_package_id", packageId).apply()
    }

    fun setVersionCodeValue(value: String) {
        versionCode = value.take(10)
        preferences.edit().putString("draft_version_code", versionCode).apply()
    }

    fun setAutoRotateValue(value: Boolean) {
        autoRotate = value
        preferences.edit().putBoolean("auto_rotate", value).apply()
    }

    fun setFullscreenValue(value: Boolean) {
        fullscreen = value
        preferences.edit().putBoolean("fullscreen", value).apply()
    }

    fun setProjectSummary(value: String) {
        projectSummaryState = value
        preferences.edit().putString("draft_project_summary", value).apply()
    }

    fun setIcon(bitmap: Bitmap?, summary: String) {
        iconBitmap = bitmap
        iconSummary = summary
    }

    fun setStatus(message: String, busy: Boolean) {
        statusMessage = message
        isBusy = busy
        if (busy && !message.startsWith("Создаю и подписываю APK")) {
            buildProgressMessage = ""
        }
    }

    fun setBuildProgress(progress: Float, message: String) {
        buildProgress = progress.coerceIn(0f, 1f)
        buildProgressMessage = message
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
        var showClearProjectDialog by remember { mutableStateOf(false) }
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
                    StudioHeader()
                    SectionCard(
                        title = if (pythonRuntimeSelected) "01 · PYTHON ENGINE" else "01 · ПРОЕКТ",
                        subtitle = if (pythonRuntimeSelected) "Локальный сервер Flask внутри APK." else "Выберите HTML-файл или ZIP-проект."
                    ) {
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.fillMaxWidth()) {
                            OutlinedButton(
                                onClick = { setPythonServerMode(false) },
                                enabled = !isBusy,
                                modifier = Modifier.weight(1f).height(46.dp),
                                shape = RoundedCornerShape(14.dp),
                                border = BorderStroke(1.dp, if (!pythonRuntimeSelected) Mint else Outline),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = if (!pythonRuntimeSelected) Mint else Ink)
                            ) {
                                androidx.compose.material3.Text("Статический сайт", fontSize = 12.sp)
                            }
                            OutlinedButton(
                                onClick = { setPythonServerMode(true) },
                                enabled = !isBusy,
                                modifier = Modifier.weight(1f).height(46.dp),
                                shape = RoundedCornerShape(14.dp),
                                border = BorderStroke(1.dp, if (pythonRuntimeSelected) Mint else Outline),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = if (pythonRuntimeSelected) Mint else Ink)
                            ) {
                                androidx.compose.material3.Text("Python / Flask", fontSize = 12.sp)
                            }
                        }
                        Spacer(Modifier.height(10.dp))
                        if (pythonRuntimeSelected) {
                            Surface(
                                modifier = Modifier.fillMaxWidth(),
                                shape = RoundedCornerShape(14.dp),
                                color = Raised
                            ) {
                                Column(modifier = Modifier.padding(13.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                                    androidx.compose.material3.Text(
                                        "Python 3.10 + Flask · Android API 22–36",
                                        color = Mint,
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    androidx.compose.material3.Text(
                                        "Проект: $pythonProjectSummaryState",
                                        color = Ink,
                                        fontSize = 12.sp,
                                        lineHeight = 17.sp
                                    )
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        OutlinedButton(
                                            onClick = { activity.openPythonProjectPicker() },
                                            enabled = !isBusy,
                                            modifier = Modifier.weight(1f).height(44.dp),
                                            shape = RoundedCornerShape(13.dp),
                                            border = BorderStroke(1.dp, Outline),
                                            colors = ButtonDefaults.outlinedButtonColors(contentColor = Ink)
                                        ) {
                                            androidx.compose.material3.Text("Импорт .py / ZIP", fontSize = 12.sp)
                                        }
                                        if (pythonProjectSummaryState != "Python-проект не выбран") {
                                            TextButton(onClick = { activity.clearPythonProject() }, enabled = !isBusy) {
                                                androidx.compose.material3.Text("Удалить", color = Error, fontSize = 11.sp)
                                            }
                                        }
                                    }
                                    androidx.compose.material3.Text(
                                        "WSGI: app.py / wsgi.py / server.py или webapk.json. requirements.txt не устанавливается автоматически: добавьте Android-совместимые .whl в wheels/ либо код в vendor/.",
                                        color = Muted,
                                        fontSize = 11.sp,
                                        lineHeight = 16.sp
                                    )
                                }
                            }
                        } else {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                androidx.compose.material3.Text(
                                    text = projectSummaryState,
                                    color = if (projectReady) Mint else Muted,
                                    fontSize = 13.sp,
                                    lineHeight = 18.sp,
                                    modifier = Modifier.weight(1f)
                                )
                                if (projectReady) {
                                    TextButton(
                                        onClick = { showClearProjectDialog = true },
                                        enabled = !isBusy
                                    ) {
                                        androidx.compose.material3.Text("Сбросить", color = Error, fontSize = 12.sp)
                                    }
                                }
                            }
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
                            Surface(
                                modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
                                shape = RoundedCornerShape(13.dp),
                                color = Raised
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 11.dp, vertical = 9.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    androidx.compose.material3.Text(
                                        text = "ЗАЩИТА",
                                        color = Mint,
                                        fontSize = 9.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Spacer(Modifier.size(9.dp))
                                    androidx.compose.material3.Text(
                                        text = "Сайт шифруется и обрабатывается на устройстве.",
                                        color = Muted,
                                        fontSize = 11.sp,
                                        lineHeight = 15.sp
                                    )
                                }
                            }
                        }
                    }

                    SectionCard(title = "02 · ОБРАЗ ПРИЛОЖЕНИЯ") {
                        StudioTextField(
                            label = "Название приложения",
                            value = appName,
                            onValueChange = { setAppNameValue(it) },
                            placeholder = "Например, Мой сайт",
                            keyboardType = KeyboardType.Text,
                            isError = false,
                            enabled = !isBusy
                        )
                        Spacer(Modifier.height(8.dp))
                        StudioTextField(
                            label = "Package ID",
                            value = packageId,
                            onValueChange = {
                                setPackageIdValue(it)
                                packageErrorState = null
                            },
                            placeholder = "com.company.mysite",
                            keyboardType = KeyboardType.Ascii,
                            isError = packageErrorState != null,
                            monospace = true,
                            enabled = !isBusy
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
                                    enabled = !isBusy,
                                    onValueChange = {
                                        setVersionCodeValue(it.filter(Char::isDigit))
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
                                        onCheckedChange = { setAutoRotateValue(it) },
                                        enabled = !isBusy
                                    )
                                }
                            }
                        }
                        Surface(
                            modifier = Modifier.fillMaxWidth().padding(top = 8.dp).height(62.dp),
                            shape = RoundedCornerShape(13.dp),
                            color = Field,
                            border = BorderStroke(1.dp, Outline)
                        ) {
                            Row(
                                modifier = Modifier.padding(start = 10.dp, end = 6.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    androidx.compose.material3.Text(
                                        text = "Полноэкранный режим",
                                        color = Ink,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Medium
                                    )
                                    androidx.compose.material3.Text(
                                        text = "Контент на весь экран",
                                        color = Muted,
                                        fontSize = 10.sp,
                                        lineHeight = 13.sp
                                    )
                                }
                                Switch(
                                    checked = fullscreen,
                                    onCheckedChange = { setFullscreenValue(it) },
                                    enabled = !isBusy
                                )
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
                                    .clip(CircleShape)
                                    .background(Raised)
                                    .border(1.dp, Outline, CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                iconBitmap?.let { bitmap ->
                                    Image(
                                        bitmap = bitmap.asImageBitmap(),
                                        contentDescription = "Иконка приложения",
                                        modifier = Modifier.fillMaxSize().padding(1.dp).clip(CircleShape),
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
            if (showClearProjectDialog) {
                AlertDialog(
                    onDismissRequest = { showClearProjectDialog = false },
                    title = { androidx.compose.material3.Text("Очистить проект?") },
                    text = { androidx.compose.material3.Text("Исходные файлы сайта и временная копия APK будут удалены. Настройки приложения и иконка сохранятся.") },
                    confirmButton = {
                        TextButton(onClick = {
                            showClearProjectDialog = false
                            activity.clearProject()
                        }) {
                            androidx.compose.material3.Text("Очистить", color = Error)
                        }
                    },
                    dismissButton = {
                        TextButton(onClick = { showClearProjectDialog = false }) {
                            androidx.compose.material3.Text("Отмена")
                        }
                    }
                )
            }
        }
    }

    @Composable
    private fun StudioHeader() {
        Column(modifier = Modifier.fillMaxWidth().padding(bottom = 14.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(54.dp)
                        .clip(RoundedCornerShape(18.dp))
                        .background(Brush.linearGradient(listOf(Mint, Primary, Color(0xFF86A8FF)))),
                    contentAlignment = Alignment.Center
                ) {
                    androidx.compose.material3.Text(
                        text = "S",
                        color = Color(0xFF07120F),
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Black
                    )
                }
                Spacer(Modifier.size(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    androidx.compose.material3.Text(
                        text = "СТУДИЯ · ОФЛАЙН",
                        color = Mint,
                        fontSize = 10.sp,
                        letterSpacing = 1.6.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(2.dp))
                    androidx.compose.material3.Text(
                        text = "Соберите приложение",
                        color = Ink,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Surface(shape = RoundedCornerShape(50.dp), color = Raised) {
                    androidx.compose.material3.Text(
                        text = "ЛОКАЛЬНО",
                        color = Mint,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 9.dp, vertical = 6.dp)
                    )
                }
            }
            Spacer(Modifier.height(12.dp))
            androidx.compose.material3.Text(
                text = "Сайт, оформление и параметры установки — в одном готовом APK.",
                color = Muted,
                fontSize = 14.sp,
                lineHeight = 20.sp
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                StepBadge("01  САЙТ", Modifier.weight(1f))
                StepBadge("02  ОБРАЗ", Modifier.weight(1f))
                StepBadge("03  APK", Modifier.weight(1f))
            }
        }
    }

    @Composable
    private fun StepBadge(label: String, modifier: Modifier = Modifier) {
        Surface(modifier = modifier, shape = RoundedCornerShape(11.dp), color = Raised) {
            androidx.compose.material3.Text(
                text = label,
                color = Muted,
                fontSize = 9.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)
            )
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
            if (isBusy && buildProgressMessage.isNotEmpty()) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(top = 9.dp, bottom = 5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    androidx.compose.material3.Text(
                        text = buildProgressMessage,
                        color = Ink,
                        fontSize = 11.sp,
                        lineHeight = 15.sp,
                        modifier = Modifier.weight(1f)
                    )
                    androidx.compose.material3.Text(
                        text = "${(buildProgress * 100f).toInt()}%",
                        color = Mint,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                LinearProgressIndicator(
                    progress = { buildProgress },
                    modifier = Modifier.fillMaxWidth().height(5.dp),
                    color = Mint,
                    trackColor = Raised
                )
            }
            if (statusMessage.isNotEmpty() && !(isBusy && buildProgressMessage.isNotEmpty())) {
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
            if (canSave) {
                OutlinedButton(
                    onClick = { activity.installGeneratedApk() },
                    enabled = !isBusy,
                    modifier = Modifier.fillMaxWidth().height(44.dp),
                    shape = RoundedCornerShape(14.dp),
                    border = BorderStroke(1.dp, Primary),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Primary),
                    contentPadding = androidx.compose.foundation.layout.PaddingValues(horizontal = 12.dp)
                ) {
                    androidx.compose.material3.Text(
                        text = "Установить собранный APK",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Spacer(Modifier.height(7.dp))
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(
                    onClick = { activity.buildApk() },
                    enabled = !isBusy && projectReady,
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
                        text = when {
                            isBusy -> "Собираем…"
                            projectReady -> "Собрать приложение"
                            else -> "Выберите сайт"
                        },
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
            modifier = Modifier.fillMaxWidth().padding(bottom = 11.dp),
            shape = RoundedCornerShape(21.dp),
            colors = CardDefaults.cardColors(containerColor = CardSurface),
            border = BorderStroke(1.dp, Outline)
        ) {
            Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 15.dp)) {
                androidx.compose.material3.Text(
                    text = title,
                    color = Ink,
                    fontSize = 14.sp,
                    letterSpacing = 0.4.sp,
                    fontWeight = FontWeight.Bold
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
        monospace: Boolean = false,
        enabled: Boolean = true
    ) {
        Column {
            FieldLabel(label)
            OutlinedTextField(
                value = value,
                onValueChange = onValueChange,
                enabled = enabled,
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
        enabled: Boolean,
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
                    enabled = enabled,
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
        val Background = Color(0xFF09131B)
        val CardSurface = Color(0xFF111E29)
        val Raised = Color(0xFF1B2D39)
        val Field = Color(0xFF0D1821)
        val Outline = Color(0xFF2D4351)
        val Ink = Color(0xFFF2F7F8)
        val Muted = Color(0xFFA7BAC5)
        val Primary = Color(0xFF67E4C1)
        val Mint = Color(0xFF67E4C1)
        val PrimaryText = Color(0xFF061710)
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
