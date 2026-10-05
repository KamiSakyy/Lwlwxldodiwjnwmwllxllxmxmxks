package androidx.compose.ui;

import androidx.compose.ui.internal.PlatformOptimizedCancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public final class ModifierNodeDetachedCancellationException extends PlatformOptimizedCancellationException {
    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }
}
