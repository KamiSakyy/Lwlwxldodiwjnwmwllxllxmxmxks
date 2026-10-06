package de;

import androidx.compose.runtime.f1;
import androidx.compose.ui.layout.w;
import java.util.List;
import kotlin.KotlinNothingValueException;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class f implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21775r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f1 f21776s;

    public /* synthetic */ f(f1 f1Var, int i) {
        this.f21775r = i;
        this.f21776s = f1Var;
    }

    public final Object a() {
        switch (this.f21775r) {
            case k5.f.J:
                this.f21776s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.a;
            case 1:
                this.f21776s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.a;
            case 2:
                f1 f1Var = this.f21776s;
                a0 a0Var = a0.a;
                f1Var.setValue(a0Var);
                return a0Var;
            case 3:
                return (w) this.f21776s.getValue();
            case 4:
                this.f21776s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.a;
            case 5:
                this.f21776s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.a;
            case 6:
                this.f21776s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.a;
            case 7:
                this.f21776s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.a;
            case 8:
                return new m0.f((j71.c) this.f21776s.getValue());
            case 9:
                return new n0.i((j71.c) this.f21776s.getValue());
            case 10:
                this.f21776s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.a;
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                f1 f1Var2 = this.f21776s;
                if (f1Var2 != null) {
                    return (List) f1Var2.getValue();
                }
                return null;
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                Boolean bool = (Boolean) this.f21776s.getValue();
                bool.booleanValue();
                return bool;
            case 13:
                this.f21776s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.a;
            case 14:
                this.f21776s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.a;
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                this.f21776s.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return a0.a;
            case 16:
                this.f21776s.setValue(Boolean.TRUE);
                return a0.a;
            case 17:
                this.f21776s.setValue(Boolean.TRUE);
                return a0.a;
            case 18:
                this.f21776s.setValue(Boolean.FALSE);
                return a0.a;
            case 19:
                w wVar = (w) this.f21776s.getValue();
                if (wVar != null) {
                    return wVar;
                }
                k0.b.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 20:
                w wVar2 = (w) this.f21776s.getValue();
                if (wVar2 != null) {
                    return wVar2;
                }
                k0.b.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 21:
                this.f21776s.setValue("");
                return a0.a;
            default:
                w wVar3 = (w) this.f21776s.getValue();
                if (wVar3 != null) {
                    return wVar3;
                }
                k0.b.d("Required value was null.");
                throw new KotlinNothingValueException();
        }
    }
    public static final Object J = null;
}
