package y31;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int r;
    public final /* synthetic */ m s;

    public /* synthetic */ a(m mVar, int i) {
        this.r = i;
        this.s = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.r) {
            case 0:
                d dVar = (d) this.s;
                EditText editText = dVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar.p();
                    break;
                }
                break;
            case 1:
                ((i) this.s).t();
                break;
            default:
                s sVar = (s) this.s;
                EditText editText2 = sVar.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = sVar.f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        sVar.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        sVar.f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        sVar.f.setSelection(selectionEnd);
                    }
                    sVar.p();
                    break;
                }
                break;
        }
    }
}
