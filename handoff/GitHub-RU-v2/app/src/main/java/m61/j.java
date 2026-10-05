package m61;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j extends ContextWrapper {
    public LayoutInflater a;
    public LayoutInflater b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, a0 a0Var) {
        super(context);
        context.getClass();
        s7.a aVar = new s7.a(4, this);
        this.a = null;
        a0Var.getClass();
        a0Var.j0.h(aVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.b == null) {
            if (this.a == null) {
                this.a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.b = this.a.cloneInContext(this);
        }
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(LayoutInflater layoutInflater, a0 a0Var) {
        super(r0);
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        s7.a aVar = new s7.a(4, this);
        this.a = layoutInflater;
        a0Var.getClass();
        a0Var.j0.h(aVar);
    }
}
