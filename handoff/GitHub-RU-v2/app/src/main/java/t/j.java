package t;

import android.app.KeyguardManager;
import android.content.Intent;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class j {
    public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }
}
