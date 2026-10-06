package c21;

/* loaded from: /home/user/work/p/classes4.dex */
public class h0 {
    public final /* synthetic */ int a;
    public String b;
    public boolean c;

    public String toString() {
        switch (this.a) {
            case 1:
                return "Markdown:" + this.b;
            case 2:
            default:
                return super.toString();
            case 3:
                String str = this.b;
                boolean z = this.c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(z);
                return sb.toString();
        }
    }

    public /* synthetic */ h0(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public h0(String str) {
        this.a = 1;
        this.b = str;
        this.c = false;
    }

    public h0(String str, boolean z) {
        this.a = 2;
        this.c = z;
        this.b = str;
    }
    public Object d() { return null; }
    public Object f = null;
}
