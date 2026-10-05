package c21;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements DialogInterface.OnClickListener {
    public final /* synthetic */ int r;
    public final /* synthetic */ Intent s;
    public final /* synthetic */ Object t;

    public /* synthetic */ o(Intent intent, Object obj, int i) {
        this.r = i;
        this.s = intent;
        this.t = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [b21.e, java.lang.Object] */
    public final void a() {
        switch (this.r) {
            case 0:
                Intent intent = this.s;
                if (intent != null) {
                    ((GoogleApiActivity) this.t).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.s;
                if (intent2 != null) {
                    this.t.a(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains("generic");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
