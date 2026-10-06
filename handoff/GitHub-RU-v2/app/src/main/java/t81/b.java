package t81;

/* loaded from: /home/user/work/p/classes5.dex */
public class b extends a {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ j71.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, j71.a aVar) {
        super(str, true);
        this.f = aVar;
    }

    @Override // t81.a
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.a();
                return -1L;
            default:
                return ((Number) this.f.a()).longValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j71.a aVar, String str, boolean z) {
        super(str, z);
        this.f = aVar;
    }
}
