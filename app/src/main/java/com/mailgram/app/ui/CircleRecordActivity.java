package com.mailgram.app.ui;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;

import com.mailgram.app.R;
import com.mailgram.app.media.CircleMaskView;

import java.io.File;
import java.util.List;

/**
 * Запись видеокружка (как в Telegram): фронтальная камера, круглая маска, кольцо прогресса,
 * ограничение 30 секунд. Результат — mp4 в кэше, который затем шифруется и уходит письмом.
 */
public class CircleRecordActivity extends Activity implements SurfaceHolder.Callback {

    public static final String EXTRA_PATH = "path";
    public static final String EXTRA_DURATION = "duration";
    private static final String TAG = "MailGramCircle";
    private static final long MAX_MS = 30_000L;

    private SurfaceView preview;
    private CircleMaskView mask;
    private TextView timer;
    private View stopButton;
    private View cancelButton;

    private Camera camera;
    private MediaRecorder recorder;
    private File output;
    private long startedAt;
    private boolean finishing;
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final Runnable ticker = new Runnable() {
        @Override
        public void run() {
            if (recorder == null) return;
            long elapsed = System.currentTimeMillis() - startedAt;
            timer.setText(com.mailgram.app.media.MediaUtil.humanDuration(elapsed));
            mask.setProgress((float) elapsed / (float) MAX_MS);
            if (elapsed >= MAX_MS) {
                finishRecording(true);
                return;
            }
            handler.postDelayed(this, 60L);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_record);
        Ui.applySystemBars(this, null, null);
        Ui.marginTopForBars(findViewById(R.id.circle_timer), 0);
        Ui.liftBottomForBars(findViewById(R.id.circle_controls), 0);
        try {
            setUpScreen();
        } catch (Throwable error) {
            com.mailgram.app.util.CrashLog.record(this, error);
        }
    }

    /** Настройка экрана кружка: кадр, кнопки, файл записи. */
    private void setUpScreen() {
        preview = findViewById(R.id.circle_preview);
        mask = findViewById(R.id.circle_mask);
        timer = findViewById(R.id.circle_timer);
        stopButton = findViewById(R.id.circle_stop);
        cancelButton = findViewById(R.id.circle_cancel);

        File dir = new File(getCacheDir(), "circle");
        if (!dir.exists() && !dir.mkdirs()) dir = getCacheDir();
        output = new File(dir, "circle-" + System.nanoTime() + ".mp4");

        preview.getHolder().addCallback(this);
        stopButton.setOnClickListener(Ui.tap(v -> finishRecording(true)));
        cancelButton.setOnClickListener(Ui.tap(v -> finishRecording(false)));
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        startCamera(holder);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        // камера уже настроена
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        releaseCamera();
    }

    private void startCamera(SurfaceHolder holder) {
        try {
            int cameraId = 1; // фронтальная
            if (Camera.getNumberOfCameras() < 2) cameraId = 0;
            camera = Camera.open(cameraId);
        } catch (Exception e) {
            Log.w(TAG, "камера недоступна: " + e);
            finish();
            return;
        }
        try {
            Camera.Parameters params = camera.getParameters();
            Camera.Size size = pickVideoSize(params);
            if (size != null) {
                params.setPreviewSize(size.width, size.height);
            }
            List<String> focus = params.getSupportedFocusModes();
            if (focus != null && focus.contains(Camera.Parameters.FOCUS_MODE_CONTINUOUS_VIDEO)) {
                params.setFocusMode(Camera.Parameters.FOCUS_MODE_CONTINUOUS_VIDEO);
            }
            camera.setParameters(params);
            camera.setDisplayOrientation(90);
            camera.setPreviewDisplay(holder);
            camera.startPreview();

            camera.unlock();
            recorder = new MediaRecorder();
            recorder.setCamera(camera);
            boolean withAudio = checkSelfPermission(android.Manifest.permission.RECORD_AUDIO)
                    == android.content.pm.PackageManager.PERMISSION_GRANTED;
            if (withAudio) {
                recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
            }
            recorder.setVideoSource(MediaRecorder.VideoSource.CAMERA);
            recorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
            if (withAudio) {
                recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
            }
            recorder.setVideoEncoder(MediaRecorder.VideoEncoder.H264);
            recorder.setVideoFrameRate(24);
            recorder.setVideoEncodingBitRate(1_200_000);
            if (size != null) {
                recorder.setVideoSize(size.width, size.height);
            }
            recorder.setOutputFile(output.getAbsolutePath());
            recorder.setOrientationHint(270);
            recorder.prepare();
            recorder.start();
            startedAt = System.currentTimeMillis();
            handler.post(ticker);
            stopButton.setVisibility(View.VISIBLE);
            cancelButton.setVisibility(View.VISIBLE);
        } catch (Exception e) {
            Log.w(TAG, "запись не началась: " + e);
            releaseCamera();
            finish();
        }
    }

    /** Берём поддерживаемый размер видео поближе к квадратному и не меньше 480 по короткой стороне. */
    private Camera.Size pickVideoSize(Camera.Parameters params) {
        List<Camera.Size> sizes = params.getSupportedVideoSizes();
        if (sizes == null) sizes = params.getSupportedPreviewSizes();
        if (sizes == null || sizes.isEmpty()) return null;
        Camera.Size best = null;
        for (Camera.Size size : sizes) {
            int shortSide = Math.min(size.width, size.height);
            if (shortSide < 360 || shortSide > 720) continue;
            if (best == null || Math.abs(shortSide - 480) < Math.abs(Math.min(best.width, best.height) - 480)) {
                best = size;
            }
        }
        return best != null ? best : sizes.get(0);
    }

    private void finishRecording(boolean keep) {
        if (finishing) return;
        finishing = true;
        handler.removeCallbacks(ticker);
        long elapsed = startedAt == 0L ? 0L : System.currentTimeMillis() - startedAt;
        releaseCamera();

        if (!keep || output == null || !output.exists() || elapsed < 700L) {
            if (output != null) output.delete();
            setResult(RESULT_CANCELED);
            finish();
            return;
        }
        Intent data = new Intent();
        data.putExtra(EXTRA_PATH, output.getAbsolutePath());
        data.putExtra(EXTRA_DURATION, elapsed);
        setResult(RESULT_OK, data);
        finish();
    }

    private void releaseCamera() {
        if (recorder != null) {
            try {
                recorder.stop();
            } catch (Exception ignored) {
            }
            try {
                recorder.reset();
            } catch (Exception ignored) {
            }
            try {
                recorder.release();
            } catch (Exception ignored) {
            }
            recorder = null;
        }
        if (camera != null) {
            try {
                camera.lock();
            } catch (Exception ignored) {
            }
            try {
                camera.stopPreview();
            } catch (Exception ignored) {
            }
            try {
                camera.release();
            } catch (Exception ignored) {
            }
            camera = null;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (!finishing) finishRecording(true);
    }
}
