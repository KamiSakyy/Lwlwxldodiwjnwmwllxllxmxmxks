package v5;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: /home/user/work/p/classes.dex */
public final class i implements TextWatcher {

    /* renamed from: r, reason: collision with root package name */
    public EditText f32733r;

    /* renamed from: s, reason: collision with root package name */
    public h f32734s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f32735t = true;

    /* renamed from: u, reason: collision with root package name */
    public int f32736u;

    /* renamed from: v, reason: collision with root package name */
    public int f32737v;

    public i(EditText editText) {
        this.f32733r = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            u5.i a10 = u5.i.a();
            if (editableText == null) {
                length = 0;
            } else {
                a10.getClass();
                length = editableText.length();
            }
            a10.h(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.f32733r;
        if (!editText.isInEditMode() && this.f32735t && u5.i.d()) {
            int i = this.f32736u;
            int i10 = this.f32737v;
            if (i10 > 0) {
                int c10 = u5.i.a().c();
                if (c10 != 0) {
                    if (c10 == 1) {
                        u5.i.a().h(i, i10 + i, 0, editable);
                        return;
                    } else if (c10 != 3) {
                        return;
                    }
                }
                u5.i a10 = u5.i.a();
                if (this.f32734s == null) {
                    this.f32734s = new h(editText);
                }
                a10.i(this.f32734s);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        this.f32736u = i;
        this.f32737v = i11;
    }
    public Object h(int p1, int p2, int p3, Object p4) { return null; }
    public Object h(int p1, int p2, int p3, Object p4) { return null; }
    public Object i(Object p1) { return null; }
}
