package v0;

import android.view.textclassifier.TextClassification;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends b {

    /* renamed from: b, reason: collision with root package name */
    public final TextClassification f32334b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32335c;

    public h(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.f32334b = textClassification;
        this.f32335c = i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb2.append(this.f32322a);
        sb2.append(", textClassification=");
        sb2.append(this.f32334b);
        sb2.append(", index=");
        return i.j(sb2, this.f32335c, ')');
    }
}
