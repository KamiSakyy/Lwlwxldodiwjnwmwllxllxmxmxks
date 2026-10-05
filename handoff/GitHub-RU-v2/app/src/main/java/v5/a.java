package v5;

import android.text.Editable;
import u5.s;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f32717a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f32718b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f32719c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f32719c;
        return cls != null ? new s(cls, charSequence) : super.newEditable(charSequence);
    }
}
