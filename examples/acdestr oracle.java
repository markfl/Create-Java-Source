
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;

public class acdestr {

   private int adstrn;
   private String addoct;
   private String adrcde;
   private String adjdes;
   private String adrcd2;
   private String adjde2;
   private String adsndp;
   private String adsndn;
   private String adchgs;
   private int adentt;
   private int adentd;
   private int adeusr;
   private int adchgt;
   private int adchgd;
   private int adcusr;
   private String adex01;
   private String adex02;

   private int adstrnSav;
   private String addoctSav;
   private String adrcdeSav;
   private String adjdesSav;
   private String adrcd2Sav;
   private String adjde2Sav;
   private String adsndpSav;
   private String adsndnSav;
   private String adchgsSav;
   private int adenttSav;
   private int adentdSav;
   private int adeusrSav;
   private int adchgtSav;
   private int adchgdSav;
   private int adcusrSav;
   private String adex01Sav;
   private String adex02Sav;

   private int Keyadstrn;
   private String Keyaddoct;
   private String Keyadrcde;

   private Connection conn;
   private ResultSet results;
   private PreparedStatement checkStmt;

   private boolean recordFound;
   private boolean updateOK;
   private boolean readeOK;

   public acdestr() {

      super();

      setadstrn(0);
      setaddoct("");
      setadrcde("");
      setadjdes("");
      setadrcd2("");
      setadjde2("");
      setadsndp("");
      setadsndn("");
      setadchgs("");
      setadentt(0);
      setadentd(0);
      setadeusr(0);
      setadchgt(0);
      setadchgd(0);
      setadcusr(0);
      setadex01("");
      setadex02("");

      setadstrnSav();
      setaddoctSav();
      setadrcdeSav();
      setadjdesSav();
      setadrcd2Sav();
      setadjde2Sav();
      setadsndpSav();
      setadsndnSav();
      setadchgsSav();
      setadenttSav();
      setadentdSav();
      setadeusrSav();
      setadchgtSav();
      setadchgdSav();
      setadcusrSav();
      setadex01Sav();
      setadex02Sav();

      setKeyadstrn(getadstrn());
      setKeyaddoct(getaddoct());
      setKeyadrcde(getadrcde());

      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);
   }

   public acdestr(int adstrn, String addoct, String adrcde,
                   String adjdes, String adrcd2, String adjde2,
                   String adsndp, String adsndn, String adchgs,
                   int adentt, int adentd, int adeusr,
                   int adchgt, int adchgd, int adcusr,
                   String adex01, String adex02) {

      super();

      setadstrn(adstrn);
      setaddoct(addoct);
      setadrcde(adrcde);
      setadjdes(adjdes);
      setadrcd2(adrcd2);
      setadjde2(adjde2);
      setadsndp(adsndp);
      setadsndn(adsndn);
      setadchgs(adchgs);
      setadentt(adentt);
      setadentd(adentd);
      setadeusr(adeusr);
      setadchgt(adchgt);
      setadchgd(adchgd);
      setadcusr(adcusr);
      setadex01(adex01);
      setadex02(adex02);

      setadstrnSav();
      setaddoctSav();
      setadrcdeSav();
      setadjdesSav();
      setadrcd2Sav();
      setadjde2Sav();
      setadsndpSav();
      setadsndnSav();
      setadchgsSav();
      setadenttSav();
      setadentdSav();
      setadeusrSav();
      setadchgtSav();
      setadchgdSav();
      setadcusrSav();
      setadex01Sav();
      setadex02Sav();

      setKeyadstrn(getadstrn());
      setKeyaddoct(getaddoct());
      setKeyadrcde(getadrcde());

      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);
   }

   public int getadstrn() {
      return this.adstrn;
   }
   public void setadstrn(int adstrn) {
      this.adstrn = 0;
      if (adstrn != 0) {
         int length = 6;
         if (checkSizeInt(adstrn, length))
            this.adstrn = adstrn;
         else {
            System.out.println("Field adstrn: not updated properly. adstrn = " + adstrn);
            setUpdateOK(false);
         };
      };
   }
   public String getaddoct() {
      return this.addoct;
   }
   public void setaddoct(String addoct) {
      this.addoct = "";
      if (addoct != "") {
         int length = 1;
         if (checkSizeString(addoct, length))
            this.addoct = addoct;
         else {
            System.out.println("Field addoct: not updated properly. addoct = " + addoct);
            setUpdateOK(false);
         };
      };
   }
   public String getadrcde() {
      return this.adrcde;
   }
   public void setadrcde(String adrcde) {
      this.adrcde = "";
      if (adrcde != "") {
         int length = 3;
         if (checkSizeString(adrcde, length))
            this.adrcde = adrcde;
         else {
            System.out.println("Field adrcde: not updated properly. adrcde = " + adrcde);
            setUpdateOK(false);
         };
      };
   }
   public String getadjdes() {
      return this.adjdes;
   }
   public void setadjdes(String adjdes) {
      this.adjdes = "";
      if (adjdes != "") {
         int length = 50;
         if (checkSizeString(adjdes, length))
            this.adjdes = adjdes;
         else {
            System.out.println("Field adjdes: not updated properly. adjdes = " + adjdes);
            setUpdateOK(false);
         };
      };
   }
   public String getadrcd2() {
      return this.adrcd2;
   }
   public void setadrcd2(String adrcd2) {
      this.adrcd2 = "";
      if (adrcd2 != "") {
         int length = 3;
         if (checkSizeString(adrcd2, length))
            this.adrcd2 = adrcd2;
         else {
            System.out.println("Field adrcd2: not updated properly. adrcd2 = " + adrcd2);
            setUpdateOK(false);
         };
      };
   }
   public String getadjde2() {
      return this.adjde2;
   }
   public void setadjde2(String adjde2) {
      this.adjde2 = "";
      if (adjde2 != "") {
         int length = 50;
         if (checkSizeString(adjde2, length))
            this.adjde2 = adjde2;
         else {
            System.out.println("Field adjde2: not updated properly. adjde2 = " + adjde2);
            setUpdateOK(false);
         };
      };
   }
   public String getadsndp() {
      return this.adsndp;
   }
   public void setadsndp(String adsndp) {
      this.adsndp = "";
      if (adsndp != "") {
         int length = 1;
         if (checkSizeString(adsndp, length))
            this.adsndp = adsndp;
         else {
            System.out.println("Field adsndp: not updated properly. adsndp = " + adsndp);
            setUpdateOK(false);
         };
      };
   }
   public String getadsndn() {
      return this.adsndn;
   }
   public void setadsndn(String adsndn) {
      this.adsndn = "";
      if (adsndn != "") {
         int length = 1;
         if (checkSizeString(adsndn, length))
            this.adsndn = adsndn;
         else {
            System.out.println("Field adsndn: not updated properly. adsndn = " + adsndn);
            setUpdateOK(false);
         };
      };
   }
   public String getadchgs() {
      return this.adchgs;
   }
   public void setadchgs(String adchgs) {
      this.adchgs = "";
      if (adchgs != "") {
         int length = 1;
         if (checkSizeString(adchgs, length))
            this.adchgs = adchgs;
         else {
            System.out.println("Field adchgs: not updated properly. adchgs = " + adchgs);
            setUpdateOK(false);
         };
      };
   }
   public int getadentt() {
      return this.adentt;
   }
   public void setadentt(int adentt) {
      this.adentt = 0;
      if (adentt != 0) {
         int length = 6;
         if (checkSizeInt(adentt, length))
            this.adentt = adentt;
         else {
            System.out.println("Field adentt: not updated properly. adentt = " + adentt);
            setUpdateOK(false);
         };
      };
   }
   public int getadentd() {
      return this.adentd;
   }
   public void setadentd(int adentd) {
      this.adentd = 0;
      if (adentd != 0) {
         int length = 8;
         if (checkSizeInt(adentd, length))
            this.adentd = adentd;
         else {
            System.out.println("Field adentd: not updated properly. adentd = " + adentd);
            setUpdateOK(false);
         };
      };
   }
   public int getadeusr() {
      return this.adeusr;
   }
   public void setadeusr(int adeusr) {
      this.adeusr = 0;
      if (adeusr != 0) {
         int length = 8;
         if (checkSizeInt(adeusr, length))
            this.adeusr = adeusr;
         else {
            System.out.println("Field adeusr: not updated properly. adeusr = " + adeusr);
            setUpdateOK(false);
         };
      };
   }
   public int getadchgt() {
      return this.adchgt;
   }
   public void setadchgt(int adchgt) {
      this.adchgt = 0;
      if (adchgt != 0) {
         int length = 6;
         if (checkSizeInt(adchgt, length))
            this.adchgt = adchgt;
         else {
            System.out.println("Field adchgt: not updated properly. adchgt = " + adchgt);
            setUpdateOK(false);
         };
      };
   }
   public int getadchgd() {
      return this.adchgd;
   }
   public void setadchgd(int adchgd) {
      this.adchgd = 0;
      if (adchgd != 0) {
         int length = 8;
         if (checkSizeInt(adchgd, length))
            this.adchgd = adchgd;
         else {
            System.out.println("Field adchgd: not updated properly. adchgd = " + adchgd);
            setUpdateOK(false);
         };
      };
   }
   public int getadcusr() {
      return this.adcusr;
   }
   public void setadcusr(int adcusr) {
      this.adcusr = 0;
      if (adcusr != 0) {
         int length = 8;
         if (checkSizeInt(adcusr, length))
            this.adcusr = adcusr;
         else {
            System.out.println("Field adcusr: not updated properly. adcusr = " + adcusr);
            setUpdateOK(false);
         };
      };
   }
   public String getadex01() {
      return this.adex01;
   }
   public void setadex01(String adex01) {
      this.adex01 = "";
      if (adex01 != "") {
         int length = 15;
         if (checkSizeString(adex01, length))
            this.adex01 = adex01;
         else {
            System.out.println("Field adex01: not updated properly. adex01 = " + adex01);
            setUpdateOK(false);
         };
      };
   }
   public String getadex02() {
      return this.adex02;
   }
   public void setadex02(String adex02) {
      this.adex02 = "";
      if (adex02 != "") {
         int length = 15;
         if (checkSizeString(adex02, length))
            this.adex02 = adex02;
         else {
            System.out.println("Field adex02: not updated properly. adex02 = " + adex02);
            setUpdateOK(false);
         };
      };
   }

   public int getadstrnSav() {
      return this.adstrnSav;
   }
   public void setadstrnSav() {
      this.adstrnSav = getadstrn();
   }
   public String getaddoctSav() {
      return this.addoctSav;
   }
   public void setaddoctSav() {
      this.addoctSav = getaddoct();
   }
   public String getadrcdeSav() {
      return this.adrcdeSav;
   }
   public void setadrcdeSav() {
      this.adrcdeSav = getadrcde();
   }
   public String getadjdesSav() {
      return this.adjdesSav;
   }
   public void setadjdesSav() {
      this.adjdesSav = getadjdes();
   }
   public String getadrcd2Sav() {
      return this.adrcd2Sav;
   }
   public void setadrcd2Sav() {
      this.adrcd2Sav = getadrcd2();
   }
   public String getadjde2Sav() {
      return this.adjde2Sav;
   }
   public void setadjde2Sav() {
      this.adjde2Sav = getadjde2();
   }
   public String getadsndpSav() {
      return this.adsndpSav;
   }
   public void setadsndpSav() {
      this.adsndpSav = getadsndp();
   }
   public String getadsndnSav() {
      return this.adsndnSav;
   }
   public void setadsndnSav() {
      this.adsndnSav = getadsndn();
   }
   public String getadchgsSav() {
      return this.adchgsSav;
   }
   public void setadchgsSav() {
      this.adchgsSav = getadchgs();
   }
   public int getadenttSav() {
      return this.adenttSav;
   }
   public void setadenttSav() {
      this.adenttSav = getadentt();
   }
   public int getadentdSav() {
      return this.adentdSav;
   }
   public void setadentdSav() {
      this.adentdSav = getadentd();
   }
   public int getadeusrSav() {
      return this.adeusrSav;
   }
   public void setadeusrSav() {
      this.adeusrSav = getadeusr();
   }
   public int getadchgtSav() {
      return this.adchgtSav;
   }
   public void setadchgtSav() {
      this.adchgtSav = getadchgt();
   }
   public int getadchgdSav() {
      return this.adchgdSav;
   }
   public void setadchgdSav() {
      this.adchgdSav = getadchgd();
   }
   public int getadcusrSav() {
      return this.adcusrSav;
   }
   public void setadcusrSav() {
      this.adcusrSav = getadcusr();
   }
   public String getadex01Sav() {
      return this.adex01Sav;
   }
   public void setadex01Sav() {
      this.adex01Sav = getadex01();
   }
   public String getadex02Sav() {
      return this.adex02Sav;
   }
   public void setadex02Sav() {
      this.adex02Sav = getadex02();
   }

   public int getKeyadstrn() {
      return this.Keyadstrn;
   }
   public void setKeyadstrn(int Keyadstrn) {
      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);
      this.Keyadstrn = 0;
      if (Keyadstrn != 0) {
         int length = 6;
         if (checkSizeInt(Keyadstrn, length))
            this.Keyadstrn = Keyadstrn;
         else {
            System.out.println("Field Keyadstrn: not updated properly. Keyadstrn = " + Keyadstrn);
            setUpdateOK(false);
         };
      };
   }
   public String getKeyaddoct() {
      return this.Keyaddoct;
   }
   public void setKeyaddoct(String Keyaddoct) {
      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);
      this.Keyaddoct = "";
      if (Keyaddoct != "") {
         int length = 1;
         if (checkSizeString(Keyaddoct, length))
            this.Keyaddoct = Keyaddoct;
         else {
            System.out.println("Field Keyaddoct: not updated properly. Keyaddoct = " + Keyaddoct);
            setUpdateOK(false);
         };
      };
   }
   public String getKeyadrcde() {
      return this.Keyadrcde;
   }
   public void setKeyadrcde(String Keyadrcde) {
      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);
      this.Keyadrcde = "";
      if (Keyadrcde != "") {
         int length = 3;
         if (checkSizeString(Keyadrcde, length))
            this.Keyadrcde = Keyadrcde;
         else {
            System.out.println("Field Keyadrcde: not updated properly. Keyadrcde = " + Keyadrcde);
            setUpdateOK(false);
         };
      };
   }

   public boolean getRecordFound() {
      return this.recordFound;
   }
   public void setRecordFound(boolean recordFound) {
      this.recordFound = recordFound;
   }
   public boolean getUpdateOK() {
      return this.updateOK;
   }
   public void setUpdateOK(boolean updateOK) {
      this.updateOK = updateOK;
   }
   public boolean getReadeOK() {
      return this.readeOK;
   }
   public void setReadeOK(boolean readeOK) {
      this.readeOK = readeOK;
   }

   public void setKeyFields() {

      setKeyadstrn(getadstrn());
      setKeyaddoct(getaddoct());
      setKeyadrcde(getadrcde());

   }

   public void setKeyFields(int Keyadstrn, String Keyaddoct, String Keyadrcde) {

      setKeyadstrn(Keyadstrn);
      setKeyaddoct(Keyaddoct);
      setKeyadrcde(Keyadrcde);
   }

   public void connect(String userName, String passWord) throws SQLException {

      String url = "jdbc:oracle:thin:@localhost:1521:DSCLogistics";

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      }
      catch (Exception e) {
      }

      conn = DriverManager.getConnection(url, userName, passWord);

      readeOK = false;
   }

   public void closeConnection() throws SQLException {

      if (conn != null)
         conn.close();

      checkStmt.close();
      results.close();
   }

   public boolean get() throws SQLException {

      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);

      if (conn == null)
         return false;

      if (Keyadstrn == "") {
         System.out.println("Key fields must be set.");
         return false;
      };

      String checkSql = "select adstrn, addoct, adrcde, adjdes, adrcd2, adjde2, adsndp, adsndn," +
                              " adchgs, adentt, adentd, adeusr, adchgt, adchgd, adcusr, adex01," +
                              adex02" +
                        " from acdestr" +
                        " where adstrn=? and addoct=? and adrcde=?";

      checkStmt = conn.prepareStatement(checkSql);

      checkStmt.setInt(1, Keyadstrn);
      checkStmt.setString(2, Keyaddoct);
      checkStmt.setString(3, Keyadrcde);

      results = checkStmt.executeQuery();

      SQLWarning warning = results.getWarnings();
      printSQLWarnings(warning);
      warning = checkStmt.getWarnings();
      printSQLWarnings(warning);

      if (results.next()) {

         updateAllFromResults();
         setKeyFields();
         setRecordFound(true);
         setUpdateOK(true);
         return true;

      } else {

         setReadeOK(false);
         setUpdateOK(false);
         setRecordFound(false);
         System.out.println("Record not retrieved.");
         return false;

      }
   }

   public boolean exists() throws SQLException {
      int count;

      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);

      if (conn == null)
         return false;

      if (Keyadstrn == "") {
         System.out.println("Key fields must be set.");
         return false;
      };

      String checkSql = "select count(*) as count from acdestr ";
      if (Keyadstrn != 0) {
         checkSql = checkSql + " where adstrn=?";
      if (Keyaddoct != "") {
         checkSql = checkSql + " and addoct=?";
      if (Keyadrcde != "") {
         checkSql = checkSql + " and adrcde=?";
      };};};

      checkStmt = conn.prepareStatement(checkSql);

      count = 1;

      if (Keyadstrn != 0) {
         checkStmt.setInt(count++, Keyadstrn);
      if (Keyaddoct != "") {
         checkStmt.setString(count++, Keyaddoct);
      if (Keyadrcde != "") {
         checkStmt.setString(count++, Keyadrcde);
      };};};

      results = checkStmt.executeQuery();

      SQLWarning warning = results.getWarnings();
      printSQLWarnings(warning);
      warning = checkStmt.getWarnings();
      printSQLWarnings(warning);

      results.next();
      count = results.getInt(1);

      if (count > 0)
         return true;
      else
         return false;
   }

   public boolean add() throws SQLException {

      setReadeOK(false);

      if (!getUpdateOK()) {
         System.out.println("Some fields were not               updated properly.");
         return false;
      }

      String checkSql = "insert into acdestr (adstrn,addoct,adrcde,adjdes,adrcd2," +
                                              "adjde2,adsndp,adsndn,adchgs,adentt," +
                                              "adentd,adeusr,adchgt,adchgd,adcusr," +
                                              "adex01,adex02)" +
                        " values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

      checkStmt = conn.prepareStatement(checkSql);

      checkStmt.setInt(1, adstrn);
      checkStmt.setString(2, addoct);
      checkStmt.setString(3, adrcde);
      checkStmt.setString(4, adjdes);
      checkStmt.setString(5, adrcd2);
      checkStmt.setString(6, adjde2);
      checkStmt.setString(7, adsndp);
      checkStmt.setString(8, adsndn);
      checkStmt.setString(9, adchgs);
      checkStmt.setInt(10, adentt);
      checkStmt.setInt(11, adentd);
      checkStmt.setInt(12, adeusr);
      checkStmt.setInt(13, adchgt);
      checkStmt.setInt(14, adchgd);
      checkStmt.setInt(15, adcusr);
      checkStmt.setString(16, adex01);
      checkStmt.setString(17, adex02);

      int record = checkStmt.executeUpdate();

      SQLWarning warning = checkStmt.getWarnings();
      printSQLWarnings(warning);

      if (record > 0)
         return true;
      else
         return false;

   }

   public boolean update() throws SQLException {

      boolean fieldBefore = false;
      setReadeOK(false);

      if (!getUpdateOK()) {
         System.out.println("Some fields were not               updated properly.");
         return false;
      }

      if (!getRecordFound()) {
         System.out.println("Record not retrieved.");
         return false;
      }

      String checkSql = "update acdestr set ";

      if (adstrn != adstrnSav) {
         checkSql = checkSql.concat(" adstrn = ?");
         fieldBefore = true;
      };
      if (addoct != addoctSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" addoct = ?");
         fieldBefore = true;
      };
      if (adrcde != adrcdeSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adrcde = ?");
         fieldBefore = true;
      };
      if (adjdes != adjdesSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adjdes = ?");
         fieldBefore = true;
      };
      if (adrcd2 != adrcd2Sav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adrcd2 = ?");
         fieldBefore = true;
      };
      if (adjde2 != adjde2Sav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adjde2 = ?");
         fieldBefore = true;
      };
      if (adsndp != adsndpSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adsndp = ?");
         fieldBefore = true;
      };
      if (adsndn != adsndnSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adsndn = ?");
         fieldBefore = true;
      };
      if (adchgs != adchgsSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adchgs = ?");
         fieldBefore = true;
      };
      if (adentt != adenttSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adentt = ?");
         fieldBefore = true;
      };
      if (adentd != adentdSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adentd = ?");
         fieldBefore = true;
      };
      if (adeusr != adeusrSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adeusr = ?");
         fieldBefore = true;
      };
      if (adchgt != adchgtSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adchgt = ?");
         fieldBefore = true;
      };
      if (adchgd != adchgdSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adchgd = ?");
         fieldBefore = true;
      };
      if (adcusr != adcusrSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adcusr = ?");
         fieldBefore = true;
      };
      if (adex01 != adex01Sav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adex01 = ?");
         fieldBefore = true;
      };
      if (adex02 != adex02Sav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" adex02 = ?");
         fieldBefore = true;
      };

      if (Keyadstrn != 0) {
         checkSql = checkSql + " where adstrn=?";
      if (Keyaddoct != "") {
         checkSql = checkSql + " and addoct=?";
      if (Keyadrcde != "") {
         checkSql = checkSql + " and adrcde=?";
      };};};

      int count = 1;

      checkStmt = conn.prepareStatement(checkSql);

      if (adstrn != adstrnSav)
         checkStmt.setInt(count++, adstrn);

      if (addoct != addoctSav)
         checkStmt.setString(count++, addoct);

      if (adrcde != adrcdeSav)
         checkStmt.setString(count++, adrcde);

      if (adjdes != adjdesSav)
         checkStmt.setString(count++, adjdes);

      if (adrcd2 != adrcd2Sav)
         checkStmt.setString(count++, adrcd2);

      if (adjde2 != adjde2Sav)
         checkStmt.setString(count++, adjde2);

      if (adsndp != adsndpSav)
         checkStmt.setString(count++, adsndp);

      if (adsndn != adsndnSav)
         checkStmt.setString(count++, adsndn);

      if (adchgs != adchgsSav)
         checkStmt.setString(count++, adchgs);

      if (adentt != adenttSav)
         checkStmt.setInt(count++, adentt);

      if (adentd != adentdSav)
         checkStmt.setInt(count++, adentd);

      if (adeusr != adeusrSav)
         checkStmt.setInt(count++, adeusr);

      if (adchgt != adchgtSav)
         checkStmt.setInt(count++, adchgt);

      if (adchgd != adchgdSav)
         checkStmt.setInt(count++, adchgd);

      if (adcusr != adcusrSav)
         checkStmt.setInt(count++, adcusr);

      if (adex01 != adex01Sav)
         checkStmt.setString(count++, adex01);

      if (adex02 != adex02Sav)
         checkStmt.setString(count++, adex02);

      if (Keyadstrn != 0) {
         checkStmt.setInt(count++, Keyadstrn);
      if (Keyaddoct != "") {
         checkStmt.setString(count++, Keyaddoct);
      if (Keyadrcde != "") {
         checkStmt.setString(count++, Keyadrcde);
      };};};

      int record = checkStmt.executeUpdate();

      SQLWarning warning = checkStmt.getWarnings();
      printSQLWarnings(warning);

      if (record > 0)
         return true;
      else
         return false;

   }

   public boolean delete() throws SQLException {

      setReadeOK(false);

      if (!getRecordFound()) {
         System.out.println("Record not retrieved.");
         return false;
      }

      String checkSql = "delete from acdestr ";

      if (Keyadstrn != 0) {
         checkSql = checkSql + " where adstrn=?";
      if (Keyaddoct != "") {
         checkSql = checkSql + " and addoct=?";
      if (Keyadrcde != "") {
         checkSql = checkSql + " and adrcde=?";
      };};};

      checkStmt = conn.prepareStatement(checkSql);

      int count = 1;
      if (Keyadstrn != 0) {
         checkStmt.setInt(count++, Keyadstrn);
      if (Keyaddoct != "") {
         checkStmt.setString(count++, Keyaddoct);
      if (Keyadrcde != "") {
         checkStmt.setString(count++, Keyadrcde);
      };};};

      int record = checkStmt.executeUpdate();

      SQLWarning warning = checkStmt.getWarnings();
      printSQLWarnings(warning);

      if (record > 0)
         return true;
      else
         return false;

   }

   public boolean readFirst() throws SQLException {

      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);

      String checkSql = "select adstrn, addoct, adrcde, adjdes, adrcd2, adjde2, adsndp, adsndn," +
                              " adchgs, adentt, adentd, adeusr, adchgt, adchgd, adcusr, adex01," +
                              adex02" +
                        " from acdestr";

      Statement Stmt = conn.createStatement();

      results = Stmt.executeQuery(checkSql);

      SQLWarning warning = results.getWarnings();
      printSQLWarnings(warning);
      warning = Stmt.getWarnings();
      printSQLWarnings(warning);

      if (results.first()) {

         updateAllFromResults();
         setKeyFields();
         setRecordFound(true);
         setUpdateOK(true);
         return true;

      } else {

         setReadeOK(false);
         setUpdateOK(false);
         setRecordFound(false);
         return false;
      }
   }

   public boolean readNext() throws SQLException {

      setReadeOK(false);

      if (!getRecordFound()) {
         System.out.println("Record not retrieved.");
         return false;
      }

      if (results == null)
         return false;

      if (results.next()) {

         updateAllFromResults();
         setKeyFields();
         setRecordFound(true);
         setUpdateOK(true);
         return true;

      } else {

         setReadeOK(false);
         setUpdateOK(false);
         setRecordFound(false);
         return false;
      }
   }

   public boolean readLast() throws SQLException {

      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);

      String checkSql = "select adstrn, addoct, adrcde, adjdes, adrcd2, adjde2, adsndp, adsndn," +
                              " adchgs, adentt, adentd, adeusr, adchgt, adchgd, adcusr, adex01," +
                              adex02" +
                        " from acdestr";

      Statement Stmt = conn.createStatement();

      results = Stmt.executeQuery(checkSql);

      SQLWarning warning = results.getWarnings();
      printSQLWarnings(warning);
      warning = Stmt.getWarnings();
      printSQLWarnings(warning);

      if (results.last()) {

         updateAllFromResults();
         setKeyFields();
         setRecordFound(true);
         setUpdateOK(true);
         return true;

      } else {

         setReadeOK(false);
         setUpdateOK(false);
         setRecordFound(false);
         return false;

      }
   }

   public boolean readPrevious() throws SQLException {

      setReadeOK(false);

      if (!getRecordFound()) {
         System.out.println("Record not retrieved.");
         return false;
      }

      if (results == null)
         return false;

      if (results.previous()) {

         updateAllFromResults();
         setKeyFields();
         setRecordFound(true);
         setUpdateOK(true);
         return true;

      } else {

         setReadeOK(false);
         setUpdateOK(false);
         setRecordFound(false);
         return false;
      }
   }

   public boolean readEqualFirst() throws SQLException {

      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);

      if (Keyadstrn == "") {
         System.out.println("Key fields must be set.");
         return false;
      };

      String checkSql = "select adstrn, addoct, adrcde, adjdes, adrcd2, adjde2, adsndp, adsndn," +
                              " adchgs, adentt, adentd, adeusr, adchgt, adchgd, adcusr, adex01," +
                              adex02" +
                        " from acdestr ";
      if (Keyadstrn != 0) {
         checkSql = checkSql + " where adstrn=?";
      if (Keyaddoct != "") {
         checkSql = checkSql + " and addoct=?";
      if (Keyadrcde != "") {
         checkSql = checkSql + " and adrcde=?";
      };};};

      checkStmt = conn.prepareStatement(checkSql);

      if (Keyadstrn != 0) {
         checkStmt.setInt(1, Keyadstrn);
      if (Keyaddoct != "") {
         checkStmt.setString(2, Keyaddoct);
      if (Keyadrcde != "") {
         checkStmt.setString(3, Keyadrcde);
      };};};

      results = checkStmt.executeQuery();

      SQLWarning warning = results.getWarnings();
      printSQLWarnings(warning);
      warning = checkStmt.getWarnings();
      printSQLWarnings(warning);

      if (results.first()) {

         updateAllFromResults();
         setKeyFields();
         setRecordFound(true);
         setUpdateOK(true);
         setReadeOK(true);
         return true;

      } else {

         setReadeOK(false);
         setUpdateOK(false);
         setRecordFound(false);
         return false;

      }
   }

   public boolean readEqualNext() throws SQLException {

      if (!getReadeOK()) {
         System.out.println("Record not retrieved.");
         return false;
      }

      if (results == null)
         return false;

      if (results.next()) {

         updateAllFromResults();
         setKeyFields();
         setRecordFound(true);
         setUpdateOK(true);
         setReadeOK(true);
         return true;

      } else {

         setReadeOK(false);
         setUpdateOK(false);
         setRecordFound(false);
         return false;

      }
   }

   public boolean readEqualLast() throws SQLException {

      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);

      if (Keyadstrn == "") {
         System.out.println("Key fields must be set.");
         return false;
      };

      String checkSql = "select adstrn, addoct, adrcde, adjdes, adrcd2, adjde2, adsndp, adsndn," +
                              " adchgs, adentt, adentd, adeusr, adchgt, adchgd, adcusr, adex01," +
                              adex02" +
                        " from acdestr ";
      if (Keyadstrn != 0) {
         checkSql = checkSql + " where adstrn=?";
      if (Keyaddoct != "") {
         checkSql = checkSql + " and addoct=?";
      if (Keyadrcde != "") {
         checkSql = checkSql + " and adrcde=?";
      };};};

      checkStmt = conn.prepareStatement(checkSql);

      if (Keyadstrn != 0) {
         checkStmt.setInt(1, Keyadstrn);
      if (Keyaddoct != "") {
         checkStmt.setString(2, Keyaddoct);
      if (Keyadrcde != "") {
         checkStmt.setString(3, Keyadrcde);
      };};};

      results = checkStmt.executeQuery();

      SQLWarning warning = results.getWarnings();
      printSQLWarnings(warning);
      warning = checkStmt.getWarnings();
      printSQLWarnings(warning);

      if (results.last()) {

         updateAllFromResults();
         setKeyFields();
         setRecordFound(true);
         setUpdateOK(true);
         setReadeOK(true);
         return true;

      } else {

         setReadeOK(false);
         setUpdateOK(false);
         setRecordFound(false);
         return false;

      }
   }

public boolean readEqualPrevious() throws SQLException {

      if (!getReadeOK()) {
         System.out.println("Record not retrieved.");
         return false;
      }

      if (results == null)
         return false;

      if (results.previous()) {

         updateAllFromResults();
         setKeyFields();
         setRecordFound(true);
         setUpdateOK(true);
         setReadeOK(true);
         return true;

      } else {

         setReadeOK(false);
         setUpdateOK(false);
         setRecordFound(false);
         return false;

      }
   }

   public void updateAllFromResults() throws SQLException {

      if (results == null)
         return;

      setadstrn(results.getInt("adstrn"));
      setadstrnSav();
      setaddoct(results.getString("addoct"));
      setaddoctSav();
      setadrcde(results.getString("adrcde"));
      setadrcdeSav();
      setadjdes(results.getString("adjdes"));
      setadjdesSav();
      setadrcd2(results.getString("adrcd2"));
      setadrcd2Sav();
      setadjde2(results.getString("adjde2"));
      setadjde2Sav();
      setadsndp(results.getString("adsndp"));
      setadsndpSav();
      setadsndn(results.getString("adsndn"));
      setadsndnSav();
      setadchgs(results.getString("adchgs"));
      setadchgsSav();
      setadentt(results.getInt("adentt"));
      setadenttSav();
      setadentd(results.getInt("adentd"));
      setadentdSav();
      setadeusr(results.getInt("adeusr"));
      setadeusrSav();
      setadchgt(results.getInt("adchgt"));
      setadchgtSav();
      setadchgd(results.getInt("adchgd"));
      setadchgdSav();
      setadcusr(results.getInt("adcusr"));
      setadcusrSav();
      setadex01(results.getString("adex01"));
      setadex01Sav();
      setadex02(results.getString("adex02"));
      setadex02Sav();

       setKeyFields();
   }

   public String toString() {

      return "acdestr [adstrn=" + adstrn + ", addoct=" + addoct + "," +
                       "adrcde=" + adrcde + ", adjdes=" + adjdes + "," +
                       "adrcd2=" + adrcd2 + ", adjde2=" + adjde2 + "," +
                       "adsndp=" + adsndp + ", adsndn=" + adsndn + "," +
                       "adchgs=" + adchgs + ", adentt=" + adentt + "," +
                       "adentd=" + adentd + ", adeusr=" + adeusr + "," +
                       "adchgt=" + adchgt + ", adchgd=" + adchgd + "," +
                       "adcusr=" + adcusr + ", adex01=" + adex01 + "," +
                       "adex02=" + adex02 + "]";
   }

   public String toStringKey() {

      return "acdestr [adstrn=" + adstrn + ", addoct=" + addoct + "," +
                       adrcde=" + adrcde + "]";
   }

   public boolean checkSizeDouble(double field, int length, int decimal) {

      int leftInt = 0;
      int leftIntSize;
      String doubleString, leftString;
      char checkString = '.';

      doubleString = new Double(field).toString();
      int stringLength = doubleString.length();
      for (int i = 0; i < stringLength; i++) {
         char newString = doubleString.charAt(i);
         if (newString == checkString) {
            leftInt = i;
            break;
         }
      }

      leftString = doubleString.substring(0, leftInt);
      leftIntSize = leftString.length();

      if (leftIntSize > leftInt)
         return false;

      return true;

   }

   public boolean checkSizeInt(int field, int length) {

      double testInt;
      String stringInt = "";

      for (int i = 0; i < length; i++) {
         stringInt = stringInt.concat("9");
      }

      testInt = Double.parseDouble(stringInt);
      if (field > testInt) {
         System.out.println("Number to long for field size.");
         return false;
      } else
         return true;

   }

   public boolean checkSizeString(String field, int length) {

      String overflow;

      if (field.length() < length) return true;

      overflow = field.substring(length);
      String trim = overflow.trim();
      if (!trim.isEmpty()) {
         System.out.println("String to long for field size.");
         return false;
      } else
         return true;
   }

   public void printSQLWarnings(SQLWarning warning) {

      while (warning != null) {

         System.out.println(warning);
         String message = warning.getMessage();
         String sqlState = warning.getSQLState();
         int errorCode = warning.getErrorCode();
         System.out.println(message + sqlState + errorCode);
         warning = warning.getNextWarning();

      };
   }
}
