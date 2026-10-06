package e8;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: /home/user/work/p/classes.dex */
public class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h31.a f22063a;

    public b(h31.a aVar) {
        this.f22063a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f22063a.a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f22063a.b(drawable);
    }
}
