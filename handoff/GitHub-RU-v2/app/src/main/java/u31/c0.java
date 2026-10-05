package u31;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 {
    public int a;
    public s21.a b;
    public int[][] c;
    public s21.a[] d;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        b0 b0Var;
        int attributeCount;
        int i;
        int i2;
        int[][] iArr;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr2 = x21.a.K;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
                TypedValue peekValue = obtainAttributes.peekValue(0);
                if (peekValue != null) {
                    int i3 = peekValue.type;
                    if (i3 == 5) {
                        b0Var = new b0(2, TypedValue.complexToDimensionPixelSize(peekValue.data, obtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i3 == 6) {
                        b0Var = new b0(1, peekValue.getFraction(1.0f, 1.0f));
                    }
                    obtainAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i4 = 0;
                    for (i = 0; i < attributeCount; i++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i);
                        if (attributeNameResource != 2130970096) {
                            int i5 = i4 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i4] = attributeNameResource;
                            i4 = i5;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr3, i4);
                    s21.a aVar = new s21.a(9, false);
                    aVar.s = b0Var;
                    i2 = this.a;
                    if (i2 != 0 || trimStateSet.length == 0) {
                        this.b = aVar;
                    }
                    iArr = this.c;
                    if (i2 >= iArr.length) {
                        int i6 = i2 + 10;
                        int[][] iArr4 = new int[i6][];
                        System.arraycopy(iArr, 0, iArr4, 0, i2);
                        this.c = iArr4;
                        s21.a[] aVarArr = new s21.a[i6];
                        System.arraycopy(this.d, 0, aVarArr, 0, i2);
                        this.d = aVarArr;
                    }
                    int[][] iArr5 = this.c;
                    int i7 = this.a;
                    iArr5[i7] = trimStateSet;
                    this.d[i7] = aVar;
                    this.a = i7 + 1;
                }
                b0Var = null;
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i42 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i42);
                s21.a aVar2 = new s21.a(9, false);
                aVar2.s = b0Var;
                i2 = this.a;
                if (i2 != 0) {
                }
                this.b = aVar2;
                iArr = this.c;
                if (i2 >= iArr.length) {
                }
                int[][] iArr52 = this.c;
                int i72 = this.a;
                iArr52[i72] = trimStateSet2;
                this.d[i72] = aVar2;
                this.a = i72 + 1;
            }
        }
    }
}
