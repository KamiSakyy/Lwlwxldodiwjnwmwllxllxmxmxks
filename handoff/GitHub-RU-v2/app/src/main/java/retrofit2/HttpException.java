package retrofit2;

import fa1.q0;
import q81.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public class HttpException extends RuntimeException {
    public int r;
    public String s;
    public transient q0 t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpException(q0 q0Var) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder("HTTP ");
        a0 a0Var = q0Var.a;
        int i = a0Var.u;
        sb.append(i);
        sb.append(" ");
        String str = a0Var.t;
        sb.append(str);
        this.r = i;
        this.s = str;
        this.t = q0Var;
    }
}
