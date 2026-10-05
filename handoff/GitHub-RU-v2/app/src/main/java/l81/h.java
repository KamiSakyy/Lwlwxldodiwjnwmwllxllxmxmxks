package l81;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final a i;

    public h(boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, String str2, boolean z6, a aVar) {
        k71.k.g(str, "prettyPrintIndent");
        k71.k.g(str2, "classDiscriminator");
        k71.k.g(aVar, "classDiscriminatorMode");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = z5;
        this.g = str2;
        this.h = z6;
        this.i = aVar;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.a + ", ignoreUnknownKeys=" + this.b + ", isLenient=" + this.c + ", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.d + ", prettyPrintIndent='" + this.e + "', coerceInputValues=" + this.f + ", useArrayPolymorphism=false, classDiscriminator='" + this.g + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.h + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.i + ')';
    }
}
