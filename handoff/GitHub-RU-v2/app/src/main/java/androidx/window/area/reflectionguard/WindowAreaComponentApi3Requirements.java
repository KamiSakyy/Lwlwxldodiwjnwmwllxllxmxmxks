package androidx.window.area.reflectionguard;

import android.app.Activity;
import android.util.DisplayMetrics;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;

/* loaded from: /home/user/work/p/classes.dex */
public interface WindowAreaComponentApi3Requirements {
    void addRearDisplayPresentationStatusListener(Consumer consumer);

    void addRearDisplayStatusListener(Consumer consumer);

    void endRearDisplayPresentationSession();

    void endRearDisplaySession();

    DisplayMetrics getRearDisplayMetrics();

    ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(Consumer consumer);

    void removeRearDisplayStatusListener(Consumer consumer);

    void startRearDisplayPresentationSession(Activity activity, Consumer consumer);

    void startRearDisplaySession(Activity activity, Consumer consumer);






















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class Consumer {
        public Consumer() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ExtensionWindowAreaPresentation {
        public ExtensionWindowAreaPresentation() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ExtensionWindowAreaStatus {
        public ExtensionWindowAreaStatus() {
        }
    }
}
