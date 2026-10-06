package a61;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import java.lang.ref.WeakReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 extends Handler {
    public final /* synthetic */ int a = 2;
    public Object b;

    public /* synthetic */ a1() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        switch (this.a) {
            case 0:
                k71.k.g(message, "msg");
                if (message.what != 3) {
                    message.toString();
                    super.handleMessage(message);
                    break;
                } else {
                    Bundle data = message.getData();
                    if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                        str = "";
                    }
                    v71.b0.z(v71.b0.c((a71.h) this.b), (a71.h) null, (v71.a0Shadow) null, new g0(str, (a71.c) null, 1), 3);
                    break;
                }
            case 1:
                if (message.what == 1) {
                    PreferenceFragmentCompat preferenceFragmentCompat_r7 = (PreferenceFragmentCompat) this.b;
                    PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceFragmentCompat_r7.u0.g;
                    if (preferenceScreen != null) {
                        preferenceFragmentCompat_r7.v0.setAdapter(new e7.r(preferenceScreen));
                        preferenceScreen.l();
                        break;
                    }
                }
                break;
            default:
                int i = message.what;
                if (i != -3 && i != -2 && i != -1) {
                    if (i == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        break;
                    }
                } else {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(a71.h hVar) {
        super(Looper.getMainLooper());
        k71.k.g(hVar, "backgroundDispatcher");
        this.b = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(PreferenceFragmentCompat preferenceFragmentCompat, Looper looper) {
        super(looper);
        this.b = preferenceFragmentCompat;
    }

}
