package v5;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: r, reason: collision with root package name */
    public TransformationMethod f32738r;

    public j(TransformationMethod transformationMethod) {
        this.f32738r = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f32738r;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || u5.i.a().c() != 1) {
            return charSequence;
        }
        u5.i a10 = u5.i.a();
        a10.getClass();
        return a10.h(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f32738r;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i, rect);
        }
    }
}
