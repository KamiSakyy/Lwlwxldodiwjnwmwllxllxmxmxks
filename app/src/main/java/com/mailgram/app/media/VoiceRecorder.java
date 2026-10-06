package com.mailgram.app.media;

import android.content.Context;
import android.media.MediaRecorder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Запись голосового сообщения: AAC в контейнере M4A плюс амплитуды для волновой дорожки.
 * Пишем в кэш, после остановки файл шифруется и уходит письмом как обычное вложение.
 */
public final class VoiceRecorder {

    private MediaRecorder recorder;
    private File file;
    private long startedAt;
    private final List<Integer> amplitudes = new ArrayList<>();

    public boolean isRecording() {
        return recorder != null;
    }

    public long elapsedMs() {
        return startedAt == 0L ? 0L : System.currentTimeMillis() - startedAt;
    }

    public void start(Context ctx) throws Exception {
        File dir = new File(ctx.getCacheDir(), "voice");
        if (!dir.exists() && !dir.mkdirs()) dir = ctx.getCacheDir();
        file = new File(dir, "voice-" + System.nanoTime() + ".m4a");
        amplitudes.clear();

        recorder = new MediaRecorder();
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        recorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
        recorder.setAudioEncodingBitRate(64_000);
        recorder.setAudioSamplingRate(44_100);
        recorder.setOutputFile(file.getAbsolutePath());
        recorder.prepare();
        recorder.start();
        startedAt = System.currentTimeMillis();
    }

    /** Снимает текущую амплитуду (вызывать раз в ~90 мс) — из неё рисуется волна. */
    public void sample() {
        if (recorder == null) return;
        try {
            int amplitude = recorder.getMaxAmplitude();
            int value = (int) Math.min(100, Math.round(Math.sqrt(amplitude / 32767.0) * 100));
            amplitudes.add(Math.max(4, value));
        } catch (Exception ignored) {
        }
    }

    /** Последние амплитуды для живой волны во время записи. */
    public int[] liveWave() {
        int size = Math.min(44, amplitudes.size());
        int[] out = new int[size];
        for (int i = 0; i < size; i++) {
            out[i] = amplitudes.get(amplitudes.size() - size + i);
        }
        return out;
    }

    public Result stop() {
        Result result = new Result();
        if (recorder == null) return result;
        long duration = elapsedMs();
        MediaRecorder current = recorder;
        recorder = null;
        startedAt = 0L;
        try {
            current.stop();
        } catch (Exception e) {
            try {
                current.reset();
            } catch (Exception ignored) {
            }
            try {
                current.release();
            } catch (Exception ignored) {
            }
            if (file != null) file.delete();
            result.error = "слишком короткая запись";
            return result;
        }
        try {
            current.release();
        } catch (Exception ignored) {
        }
        result.file = file;
        result.durationMs = duration;
        result.amplitudes = compress(amplitudes, 40);
        return result;
    }

    public void cancel() {
        if (recorder == null) return;
        MediaRecorder current = recorder;
        recorder = null;
        startedAt = 0L;
        try {
            current.stop();
        } catch (Exception ignored) {
        }
        try {
            current.release();
        } catch (Exception ignored) {
        }
        if (file != null) file.delete();
    }

    /** Сжимаем амплитуды до нужного числа столбиков. */
    private static int[] compress(List<Integer> values, int slots) {
        if (values.isEmpty()) return new int[0];
        int[] out = new int[Math.min(slots, values.size())];
        for (int i = 0; i < out.length; i++) {
            int from = values.size() * i / out.length;
            int to = Math.max(from + 1, values.size() * (i + 1) / out.length);
            int sum = 0;
            int count = 0;
            for (int j = from; j < to && j < values.size(); j++) {
                sum += values.get(j);
                count++;
            }
            out[i] = count == 0 ? 4 : sum / count;
        }
        return out;
    }

    public static final class Result {
        public File file;
        public long durationMs;
        public int[] amplitudes = new int[0];
        public String error = "";

        public boolean ok() {
            return file != null && file.exists() && file.length() > 0 && error.isEmpty();
        }
    }
}
