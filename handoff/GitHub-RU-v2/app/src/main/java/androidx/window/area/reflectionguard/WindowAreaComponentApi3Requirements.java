package androidx.window.area.reflectionguard;

import android.app.Activity;
import android.util.DisplayMetrics;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;

/* loaded from: /home/user/work/p/classes.dex */
public interface WindowAreaComponentApi3Requirements {
    void addRearDisplayPresentationStatusListener(Consumer<ExtensionWindowAreaStatus> consumer);

    void addRearDisplayStatusListener(Consumer<Integer> consumer);

    void endRearDisplayPresentationSession();

    void endRearDisplaySession();

    DisplayMetrics getRearDisplayMetrics();

    ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(Consumer<ExtensionWindowAreaStatus> consumer);

    void removeRearDisplayStatusListener(Consumer<Integer> consumer);

    void startRearDisplayPresentationSession(Activity activity, Consumer<Integer> consumer);

    void startRearDisplaySession(Activity activity, Consumer<Integer> consumer);

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class Consumer<T1,T2,T3,T4> {
        public Consumer() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ExtensionWindowAreaPresentation<T1,T2,T3,T4> {
        public ExtensionWindowAreaPresentation() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ExtensionWindowAreaStatus<T1,T2,T3,T4> {
        public ExtensionWindowAreaStatus() {
        }
    }
}
