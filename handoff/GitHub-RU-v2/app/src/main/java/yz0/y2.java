package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y2 {
    public final Integer a;
    public final Integer b;
    public final String c;
    public final String d;

    public y2(Integer num, Integer num2, String str, String str2) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return k71.k.b(this.a, y2Var.a) && k71.k.b(this.b, y2Var.b) && k71.k.b(this.c, y2Var.c) && k71.k.b(this.d, y2Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiLineCommentFields(startLine=");
        sb.append(this.a);
        sb.append(", endLine=");
        sb.append(this.b);
        sb.append(", startLineType=");
        return x.i.k(sb, this.c, ", endLineType=", this.d, ")");
    }

    public y2(Object... a) {
    }
}
