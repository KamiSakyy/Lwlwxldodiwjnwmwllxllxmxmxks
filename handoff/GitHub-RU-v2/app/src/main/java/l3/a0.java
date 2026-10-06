package l3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class a0 implements Choreographer.FrameCallback {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f27916r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f27917s;

    public /* synthetic */ a0(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f27916r = 2;
        this.f27917s = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        switch (this.f27916r) {
            case k5.f.J:
                ((Runnable) this.f27917s).run();
                break;
            case 1:
                ((Runnable) this.f27917s).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? j7.e.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new j7.d((Context) this.f27917s, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ a0(Runnable runnable, int i) {
        this.f27916r = i;
        this.f27917s = runnable;
    }
    public a0(Object p1, int p2) {
    }
}
