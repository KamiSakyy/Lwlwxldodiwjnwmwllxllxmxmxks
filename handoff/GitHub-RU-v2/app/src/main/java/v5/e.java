package v5;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import c30.o0;

/* loaded from: /home/user/work/p/classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public KeyListener f32726a;

    /* renamed from: b, reason: collision with root package name */
    public o0 f32727b;

    public e(KeyListener keyListener) {
        o0 o0Var = new o0(9);
        this.f32726a = keyListener;
        this.f32727b = o0Var;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f32726a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f32726a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z10;
        this.f32727b.getClass();
        if (i != 67 ? i != 112 ? false : l51.h.m(editable, keyEvent, true) : l51.h.m(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || this.f32726a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f32726a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f32726a.onKeyUp(view, editable, i, keyEvent);
    }
}
