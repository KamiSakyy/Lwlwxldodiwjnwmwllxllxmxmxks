package y31;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s extends m {
    public final int e;
    public EditText f;
    public final a g;

    public s(l lVar, int i) {
        super(lVar);
        this.e = 2131231058;
        this.g = new a(this, 2);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // y31.m
    public final void b() {
        p();
    }

    @Override // y31.m
    public final int c() {
        return 2131953414;
    }

    @Override // y31.m
    public final int d() {
        return this.e;
    }

    @Override // y31.m
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // y31.m
    public final boolean j() {
        return true;
    }

    @Override // y31.m
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // y31.m
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // y31.m
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // y31.m
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
    public Object o(Object p1, Object p2) { return null; }
}
