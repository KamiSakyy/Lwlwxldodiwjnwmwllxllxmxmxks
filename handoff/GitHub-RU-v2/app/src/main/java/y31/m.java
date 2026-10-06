package y31;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m {
    public TextInputLayout a;
    public l b;
    public Context c;
    public CheckableImageButton d;

    public m(l lVar) {
        this.a = lVar.r;
        this.b = lVar;
        this.c = lVar.getContext();
        this.d = lVar.x;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return this instanceof i;
    }

    public boolean k() {
        return false;
    }

    public void l(EditText editText) {
    }

    public void m(b5.f fVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z) {
    }

    public final void p() {
        this.b.f(false);
    }

    public void q() {
    }

    public void r() {
    }
}
