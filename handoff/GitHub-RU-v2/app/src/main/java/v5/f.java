package v5;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import sy.pShadow;

/* loaded from: /home/user/work/p/classes.dex */
public final class f extends p {

    /* renamed from: a, reason: collision with root package name */
    public TextView f32728a;

    /* renamed from: b, reason: collision with root package name */
    public d f32729b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32730c = true;

    public f(TextView textView) {
        this.f32728a = textView;
        this.f32729b = new d(textView);
    }

    public final InputFilter[] l(InputFilter[] inputFilterArr) {
        if (!this.f32730c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            d dVar = this.f32729b;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == dVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }

    public final boolean n() {
        return this.f32730c;
    }

    public final void r(boolean z10) {
        if (z10) {
            TextView textView = this.f32728a;
            textView.setTransformationMethod(x(textView.getTransformationMethod()));
        }
    }

    public final void s(boolean z10) {
        this.f32730c = z10;
        TextView textView = this.f32728a;
        textView.setTransformationMethod(x(textView.getTransformationMethod()));
        textView.setFilters(l(textView.getFilters()));
    }

    public final TransformationMethod x(TransformationMethod transformationMethod) {
        return this.f32730c ? ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod) : transformationMethod instanceof j ? ((j) transformationMethod).f32738r : transformationMethod;
    }
}
