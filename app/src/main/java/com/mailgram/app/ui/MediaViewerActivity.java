package com.mailgram.app.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.appbar.MaterialToolbar;
import com.mailgram.app.R;
import com.mailgram.app.media.MediaUtil;
import com.mailgram.app.store.Msg;
import com.mailgram.app.store.Store;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Полноэкранный просмотр: фото (с масштабом и переносом), видео, кружок, голосовое и файл.
 * Всё расшифровывается на лету из локальной базы.
 */
public class MediaViewerActivity extends AppCompatActivity {

    private boolean chromeVisible = true;
    private float downY;

    public static final String EXTRA_CHAT = "chat";
    public static final String EXTRA_MID = "mid";

    private Msg msg;
    private File cached;
    private MediaPlayer player;
    private android.os.Handler handler;
    private Runnable ticker;
    private com.mailgram.app.media.VoiceWaveView wave;
    private ImageView playButton;
    private TextView timeLabel;

    private Matrix imageMatrix = new Matrix();
    private float scale = 1f;
    private final PointF last = new PointF();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_viewer);
        Ui.applySystemBars(this, findViewById(R.id.viewer_toolbar), findViewById(R.id.viewer_bottom));
        handler = new android.os.Handler(getMainLooper());
        try {
            setUpScreen();
        } catch (Throwable error) {
            com.mailgram.app.util.CrashLog.record(this, error);
        }
    }

    /** Настройка просмотрщика: заголовок, кнопки, показ изображения, видео или голосового. */
    private void setUpScreen() {
        String chatUid = getIntent().getStringExtra(EXTRA_CHAT);
        String mid = getIntent().getStringExtra(EXTRA_MID);
        msg = Store.get(this).byMid(chatUid, mid);
        if (msg == null) {
            finish();
            return;
        }

        MaterialToolbar toolbar = findViewById(R.id.viewer_toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());
        toolbar.setTitle(Store.displayName(this, msg.peer));
        toolbar.setSubtitle(subtitle());
        Anim.fadeIn(findViewById(R.id.viewer_toolbar), 260L, 0L);
        Anim.fadeIn(findViewById(R.id.viewer_bottom), 260L, 60L);
        findViewById(R.id.viewer_share).setOnClickListener(Ui.tap(v -> share()));
        findViewById(R.id.viewer_save).setOnClickListener(Ui.tap(v -> save()));

        byte[] data = MediaUtil.decode(msg.mediaB64);
        String suffix = msg.isVideo() ? ".mp4" : (msg.isVoice() ? ".m4a" : "");
        cached = MediaUtil.cacheFile(this, msg.fileName, data, suffix);

        if (msg.isImage()) {
            showImage(data);
        } else if (msg.isVideo()) {
            showVideo(cached);
        } else if (msg.isVoice()) {
            showVoice(cached);
        } else {
            MediaUtil.openFile(this, cached, msg.mediaMime);
            finish();
        }
    }

    private String subtitle() {
        if (msg.isImage()) return "Фото · " + MediaUtil.humanSize(MediaUtil.decode(msg.mediaB64).length);
        if (msg.isVideo()) return (msg.round ? "Видеосообщение · " : "Видео · ")
                + MediaUtil.humanDuration(msg.durationMs);
        if (msg.isVoice()) return "Голосовое · " + MediaUtil.humanDuration(msg.durationMs);
        return msg.fileName;
    }

    // ---------------- фото с зумом ----------------

    private void showImage(byte[] data) {
        findViewById(R.id.viewer_video_box).setVisibility(View.GONE);
        findViewById(R.id.viewer_voice_box).setVisibility(View.GONE);
        final ImageView image = findViewById(R.id.viewer_image);
        image.setVisibility(View.VISIBLE);
        Bitmap bitmap = PhotoUtil.decodeScaled(data, 2048);
        image.setImageBitmap(bitmap);
        Anim.springIn(image, 0.92f, 18f);
        image.setScaleType(ImageView.ScaleType.MATRIX);

        final ScaleGestureDetector scaleDetector = new ScaleGestureDetector(this,
                new ScaleGestureDetector.SimpleOnScaleGestureListener() {
                    @Override
                    public boolean onScale(ScaleGestureDetector detector) {
                        scale = Math.max(1f, Math.min(6f, scale * detector.getScaleFactor()));
                        imageMatrix.setScale(scale, scale, detector.getFocusX(), detector.getFocusY());
                        image.setImageMatrix(imageMatrix);
                        return true;
                    }
                });
        final GestureDetector gestureDetector = new GestureDetector(this,
                new GestureDetector.SimpleOnGestureListener() {
                    @Override
                    public boolean onDown(MotionEvent e) {
                        last.set(e.getX(), e.getY());
                        return true;
                    }

                    @Override
                    public boolean onScroll(MotionEvent e1, MotionEvent e2, float dx, float dy) {
                        imageMatrix.postTranslate(-dx, -dy);
                        image.setImageMatrix(imageMatrix);
                        return true;
                    }

                    @Override
                    public boolean onSingleTapConfirmed(MotionEvent e) {
                        toggleChrome();
                        return true;
                    }

                    @Override
                    public boolean onDoubleTap(MotionEvent e) {
                        scale = scale > 1.2f ? 1f : 2.5f;
                        imageMatrix = new Matrix();
                        imageMatrix.setScale(scale, scale, e.getX(), e.getY());
                        image.setImageMatrix(imageMatrix);
                        return true;
                    }
                });
        image.setOnTouchListener((v, event) -> {
            scaleDetector.onTouchEvent(event);
            gestureDetector.onTouchEvent(event);
            // Свайп вниз при отсутствии зума — закрыть просмотрщик (как в iOS и Telegram).
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    downY = event.getRawY();
                    break;
                case MotionEvent.ACTION_MOVE: {
                    if (scale <= 1.01f && !scaleDetector.isInProgress()) {
                        float dy = event.getRawY() - downY;
                        if (dy > 0f) {
                            image.setTranslationY(dy);
                            float fade = Math.max(0.35f, 1f - dy / (image.getHeight() * 1.4f));
                            findViewById(R.id.viewer_toolbar).setAlpha(fade);
                            findViewById(R.id.viewer_bottom).setAlpha(fade);
                        }
                    }
                    break;
                }
                case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL: {
                    float dy = image.getTranslationY();
                    if (dy > Ui.dp(this, 110)) {
                        image.animate().translationY(image.getHeight()).alpha(0f)
                                .setDuration(180L)
                                .withEndAction(this::finish)
                                .start();
                    } else if (dy > 0f) {
                        image.animate().translationY(0f).setDuration(240L)
                                .setInterpolator(new android.view.animation.OvershootInterpolator(0.9f))
                                .start();
                        findViewById(R.id.viewer_toolbar).setAlpha(chromeVisible ? 1f : 0f);
                        findViewById(R.id.viewer_bottom).setAlpha(chromeVisible ? 1f : 0f);
                    }
                    break;
                }
                default:
                    break;
            }
            return true;
        });
    }

    /** Показать или спрятать панели — на весь экран остаётся только снимок. */
    private void toggleChrome() {
        chromeVisible = !chromeVisible;
        View toolbar = findViewById(R.id.viewer_toolbar);
        View bottom = findViewById(R.id.viewer_bottom);
        Anim.fadeIn(toolbar, 220L, 0L);
        Anim.fadeIn(bottom, 220L, 40L);
        toolbar.animate().alpha(chromeVisible ? 1f : 0f).translationY(chromeVisible ? 0f : -toolbar.getHeight())
                .setDuration(220L).start();
        bottom.animate().alpha(chromeVisible ? 1f : 0f).translationY(chromeVisible ? 0f : bottom.getHeight())
                .setDuration(220L).start();
    }

    // ---------------- видео ----------------

    private void showVideo(File file) {
        findViewById(R.id.viewer_image).setVisibility(View.GONE);
        findViewById(R.id.viewer_voice_box).setVisibility(View.GONE);
        View box = findViewById(R.id.viewer_video_box);
        box.setVisibility(View.VISIBLE);
        VideoView video = findViewById(R.id.viewer_video);
        MediaController controller = new MediaController(this);
        controller.setAnchorView(video);
        video.setMediaController(controller);
        video.setVideoURI(Uri.fromFile(file));
        video.setOnPreparedListener(mp -> {
            mp.setLooping(false);
            video.start();
        });
        video.setOnErrorListener((mp, what, extra) -> {
            android.widget.Toast.makeText(this, "не удалось воспроизвести видео",
                    android.widget.Toast.LENGTH_SHORT).show();
            return true;
        });
    }

    // ---------------- голосовое ----------------

    private void showVoice(File file) {
        findViewById(R.id.viewer_image).setVisibility(View.GONE);
        findViewById(R.id.viewer_video_box).setVisibility(View.GONE);
        findViewById(R.id.viewer_voice_box).setVisibility(View.VISIBLE);
        wave = findViewById(R.id.viewer_wave);
        playButton = findViewById(R.id.viewer_play);
        timeLabel = findViewById(R.id.viewer_time);
        wave.setAmplitudes(amplitudesFrom(msg));
        wave.setProgress(0f);
        timeLabel.setText(MediaUtil.humanDuration(0) + " / " + MediaUtil.humanDuration(msg.durationMs));

        try {
            player = new MediaPlayer();
            player.setDataSource(file.getAbsolutePath());
            player.prepare();
            player.setOnCompletionListener(mp -> {
                stopTicker();
                wave.setProgress(0f);
                playButton.setImageResource(R.drawable.ic_play);
                timeLabel.setText(MediaUtil.humanDuration(0) + " / " + MediaUtil.humanDuration(msg.durationMs));
            });
        } catch (Exception e) {
            android.widget.Toast.makeText(this, "не удалось прочитать запись",
                    android.widget.Toast.LENGTH_SHORT).show();
            return;
        }
        playButton.setOnClickListener(Ui.tap(v -> togglePlay()));
        findViewById(R.id.viewer_voice_box).setOnClickListener(Ui.tap(v -> togglePlay()));
    }

    private void togglePlay() {
        if (player == null) return;
        if (player.isPlaying()) {
            player.pause();
            stopTicker();
            playButton.setImageResource(R.drawable.ic_play);
        } else {
            player.start();
            playButton.setImageResource(R.drawable.ic_pause);
            startTicker();
        }
    }

    private void startTicker() {
        stopTicker();
        ticker = new Runnable() {
            @Override
            public void run() {
                if (player == null) return;
                try {
                    int position = player.getCurrentPosition();
                    int duration = Math.max(1, player.getDuration());
                    wave.setProgress((float) position / (float) duration);
                    timeLabel.setText(MediaUtil.humanDuration(position) + " / "
                            + MediaUtil.humanDuration(duration));
                    handler.postDelayed(this, 60L);
                } catch (Exception ignored) {
                }
            }
        };
        handler.post(ticker);
    }

    private void stopTicker() {
        if (ticker != null) handler.removeCallbacks(ticker);
    }

    private static int[] amplitudesFrom(Msg msg) {
        // амплитуды волны приходят в шифрованном конверте (поле w) или, для старых
        // записей, лежат в mediaMime как «wave:4,9,12,…»
        String source = msg.wave != null && !msg.wave.isEmpty()
                ? msg.wave
                : (msg.mediaMime != null && msg.mediaMime.startsWith("wave:") ? msg.mediaMime.substring(5) : "");
        if (!source.isEmpty()) {
            try {
                String[] parts = source.split(",");
                int[] out = new int[parts.length];
                for (int i = 0; i < parts.length; i++) out[i] = Integer.parseInt(parts[i].trim());
                return out;
            } catch (Exception ignored) {
            }
        }
        return new int[0];
    }

    // ---------------- сохранить / поделиться ----------------

    private void save() {
        try {
            byte[] data = MediaUtil.decode(msg.mediaB64);
            String name = msg.fileName == null || msg.fileName.isEmpty()
                    ? ("mailgram-" + System.currentTimeMillis()
                        + (msg.isVideo() ? ".mp4" : msg.isImage() ? ".jpg" : msg.isVoice() ? ".m4a" : ".bin"))
                    : msg.fileName;
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                android.content.ContentValues values = new android.content.ContentValues();
                values.put(android.provider.MediaStore.MediaColumns.DISPLAY_NAME, name);
                values.put(android.provider.MediaStore.MediaColumns.MIME_TYPE,
                        msg.mediaMime == null || msg.mediaMime.isEmpty() ? "application/octet-stream" : msg.mediaMime);
                values.put(android.provider.MediaStore.MediaColumns.RELATIVE_PATH,
                        android.os.Environment.DIRECTORY_DOWNLOADS + "/MailGram");
                Uri target = getContentResolver().insert(
                        android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI, values);
                if (target != null) {
                    try (OutputStream os = getContentResolver().openOutputStream(target)) {
                        if (os != null) os.write(data);
                    }
                    android.widget.Toast.makeText(this, "сохранено в «Загрузки/MailGram»",
                            android.widget.Toast.LENGTH_SHORT).show();
                    return;
                }
            }
            File dir = new File(getExternalFilesDir(null), "MailGram");
            if (!dir.exists()) dir.mkdirs();
            File out = new File(dir, name);
            try (OutputStream os = new FileOutputStream(out)) {
                os.write(data);
            }
            android.widget.Toast.makeText(this, "сохранено: " + out.getAbsolutePath(),
                    android.widget.Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            android.widget.Toast.makeText(this, "не удалось сохранить: " + e.getMessage(),
                    android.widget.Toast.LENGTH_LONG).show();
        }
    }

    private void share() {
        try {
            Uri uri = FileProvider.getUriForFile(this, getPackageName() + ".files", cached);
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType(msg.mediaMime == null || msg.mediaMime.isEmpty()
                    ? "*/*" : msg.mediaMime);
            intent.putExtra(Intent.EXTRA_STREAM, uri);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivity(Intent.createChooser(intent, "Поделиться"));
        } catch (Exception e) {
            android.widget.Toast.makeText(this, "не удалось поделиться",
                    android.widget.Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (player != null && player.isPlaying()) {
            player.pause();
            stopTicker();
            if (playButton != null) playButton.setImageResource(R.drawable.ic_play);
        }
        VideoView video = findViewById(R.id.viewer_video);
        if (video != null && video.isPlaying()) video.pause();
    }

    @Override
    protected void onDestroy() {
        stopTicker();
        if (player != null) {
            try {
                player.release();
            } catch (Exception ignored) {
            }
            player = null;
        }
        super.onDestroy();
    }
}
