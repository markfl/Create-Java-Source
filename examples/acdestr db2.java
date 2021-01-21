
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

      setADstrn(0);
      setADdoct("");
      setADrcde("");
      setADjdes("");
      setADrcd2("");
      setADjde2("");
      setADsndp("");
      setADsndn("");
      setADchgs("");
      setADentt(0);
      setADentd(0);
      setADeusr(0);
      setADchgt(0);
      setADchgd(0);
      setADcusr(0);
      setADex01("");
      setADex02("");

      setADstrnSav();
      setADdoctSav();
      setADrcdeSav();
      setADjdesSav();
      setADrcd2Sav();
      setADjde2Sav();
      setADsndpSav();
      setADsndnSav();
      setADchgsSav();
      setADenttSav();
      setADentdSav();
      setADeusrSav();
      setADchgtSav();
      setADchgdSav();
      setADcusrSav();
      setADex01Sav();
      setADex02Sav();

      setKeyADstrn(getADstrn());
      setKeyADdoct(getADdoct());
      setKeyADrcde(getADrcde());

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

      setADstrn(adstrn);
      setADdoct(addoct);
      setADrcde(adrcde);
      setADjdes(adjdes);
      setADrcd2(adrcd2);
      setADjde2(adjde2);
      setADsndp(adsndp);
      setADsndn(adsndn);
      setADchgs(adchgs);
      setADentt(adentt);
      setADentd(adentd);
      setADeusr(adeusr);
      setADchgt(adchgt);
      setADchgd(adchgd);
      setADcusr(adcusr);
      setADex01(adex01);
      setADex02(adex02);

      setADstrnSav();
      setADdoctSav();
      setADrcdeSav();
      setADjdesSav();
      setADrcd2Sav();
      setADjde2Sav();
      setADsndpSav();
      setADsndnSav();
      setADchgsSav();
      setADenttSav();
      setADentdSav();
      setADeusrSav();
      setADchgtSav();
      setADchgdSav();
      setADcusrSav();
      setADex01Sav();
      setADex02Sav();

      setKeyADstrn(getADstrn());
      setKeyADdoct(getADdoct());
      setKeyADrcde(getADrcde());

      setReadeOK(false);
      setUpdateOK(false);
      setRecordFound(false);
   }

   public int getADstrn() {
      return this.adstrn;
   }
   public void setADstrn(int adstrn) {
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
   public String getADdoct() {
      return this.addoct;
   }
   public void setADdoct(String addoct) {
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
   public String getADrcde() {
      return this.adrcde;
   }
   public void setADrcde(String adrcde) {
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
   public String getADjdes() {
      return this.adjdes;
   }
   public void setADjdes(String adjdes) {
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
   public String getADrcd2() {
      return this.adrcd2;
   }
   public void setADrcd2(String adrcd2) {
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
   public String getADjde2() {
      return this.adjde2;
   }
   public void setADjde2(String adjde2) {
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
   public String getADsndp() {
      return this.adsndp;
   }
   public void setADsndp(String adsndp) {
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
   public String getADsndn() {
      return this.adsndn;
   }
   public void setADsndn(String adsndn) {
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
   public String getADchgs() {
      return this.adchgs;
   }
   public void setADchgs(String adchgs) {
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
   public int getADentt() {
      return this.adentt;
   }
   public void setADentt(int adentt) {
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
   public int getADentd() {
      return this.adentd;
   }
   public void setADentd(int adentd) {
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
   public int getADeusr() {
      return this.adeusr;
   }
   public void setADeusr(int adeusr) {
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
   public int getADchgt() {
      return this.adchgt;
   }
   public void setADchgt(int adchgt) {
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
   public int getADchgd() {
      return this.adchgd;
   }
   public void setADchgd(int adchgd) {
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
   public int getADcusr() {
      return this.adcusr;
   }
   public void setADcusr(int adcusr) {
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
   public String getADex01() {
      return this.adex01;
   }
   public void setADex01(String adex01) {
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
   public String getADex02() {
      return this.adex02;
   }
   public void setADex02(String adex02) {
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

   public int getADstrnSav() {
      return this.adstrnSav;
   }
   public void setADstrnSav() {
      this.adstrnSav = getADstrn();
   }
   public String getADdoctSav() {
      return this.addoctSav;
   }
   public void setADdoctSav() {
      this.addoctSav = getADdoct();
   }
   public String getADrcdeSav() {
      return this.adrcdeSav;
   }
   public void setADrcdeSav() {
      this.adrcdeSav = getADrcde();
   }
   public String getADjdesSav() {
      return this.adjdesSav;
   }
   public void setADjdesSav() {
      this.adjdesSav = getADjdes();
   }
   public String getADrcd2Sav() {
      return this.adrcd2Sav;
   }
   public void setADrcd2Sav() {
      this.adrcd2Sav = getADrcd2();
   }
   public String getADjde2Sav() {
      return this.adjde2Sav;
   }
   public void setADjde2Sav() {
      this.adjde2Sav = getADjde2();
   }
   public String getADsndpSav() {
      return this.adsndpSav;
   }
   public void setADsndpSav() {
      this.adsndpSav = getADsndp();
   }
   public String getADsndnSav() {
      return this.adsndnSav;
   }
   public void setADsndnSav() {
      this.adsndnSav = getADsndn();
   }
   public String getADchgsSav() {
      return this.adchgsSav;
   }
   public void setADchgsSav() {
      this.adchgsSav = getADchgs();
   }
   public int getADenttSav() {
      return this.adenttSav;
   }
   public void setADenttSav() {
      this.adenttSav = getADentt();
   }
   public int getADentdSav() {
      return this.adentdSav;
   }
   public void setADentdSav() {
      this.adentdSav = getADentd();
   }
   public int getADeusrSav() {
      return this.adeusrSav;
   }
   public void setADeusrSav() {
      this.adeusrSav = getADeusr();
   }
   public int getADchgtSav() {
      return this.adchgtSav;
   }
   public void setADchgtSav() {
      this.adchgtSav = getADchgt();
   }
   public int getADchgdSav() {
      return this.adchgdSav;
   }
   public void setADchgdSav() {
      this.adchgdSav = getADchgd();
   }
   public int getADcusrSav() {
      return this.adcusrSav;
   }
   public void setADcusrSav() {
      this.adcusrSav = getADcusr();
   }
   public String getADex01Sav() {
      return this.adex01Sav;
   }
   public void setADex01Sav() {
      this.adex01Sav = getADex01();
   }
   public String getADex02Sav() {
      return this.adex02Sav;
   }
   public void setADex02Sav() {
      this.adex02Sav = getADex02();
   }

   public int getKeyADstrn() {
      return this.Keyadstrn;
   }
   public void setKeyADstrn(int Keyadstrn) {
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
   public String getKeyADdoct() {
      return this.Keyaddoct;
   }
   public void setKeyADdoct(String Keyaddoct) {
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
   public String getKeyADrcde() {
      return this.Keyadrcde;
   }
   public void setKeyADrcde(String Keyadrcde) {
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

      setKeyADstrn(getADstrn());
      setKeyADdoct(getADdoct());
      setKeyADrcde(getADrcde());

   }

   public void setKeyFields(int Keyadstrn, String Keyaddoct, String Keyadrcde) {

      setKeyADstrn(Keyadstrn);
      setKeyADdoct(Keyaddoct);
      setKeyADrcde(Keyadrcde);
   }

   public void connect(String userName, String passWord) throws SQLException {

      String url = "jdbc:db2:://localhostDSCLogistics";

      try {
         Class.forName("COM.ibm.db2.jdbc.app.DB2Driver");
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

      String checkSql = "select ADSTRN, ADDOCT, ADRCDE, ADJDES, ADRCD2, ADJDE2, ADSNDP, ADSNDN," +
                              " ADCHGS, ADENTT, ADENTD, ADEUSR, ADCHGT, ADCHGD, ADCUSR, ADEX01," +
                              ADEX02" +
                        " from acdestr" +
                        " where ADSTRN=? and ADDOCT=? and ADRCDE=?";

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

      String checkSql = "insert into acdestr (ADSTRN,ADDOCT,ADRCDE,ADJDES,ADRCD2," +
                                              "ADJDE2,ADSNDP,ADSNDN,ADCHGS,ADENTT," +
                                              "ADENTD,ADEUSR,ADCHGT,ADCHGD,ADCUSR," +
                                              "ADEX01,ADEX02)" +
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
         checkSql = checkSql.concat(" ADSTRN = ?");
         fieldBefore = true;
      };
      if (addoct != addoctSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADDOCT = ?");
         fieldBefore = true;
      };
      if (adrcde != adrcdeSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADRCDE = ?");
         fieldBefore = true;
      };
      if (adjdes != adjdesSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADJDES = ?");
         fieldBefore = true;
      };
      if (adrcd2 != adrcd2Sav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADRCD2 = ?");
         fieldBefore = true;
      };
      if (adjde2 != adjde2Sav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADJDE2 = ?");
         fieldBefore = true;
      };
      if (adsndp != adsndpSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADSNDP = ?");
         fieldBefore = true;
      };
      if (adsndn != adsndnSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADSNDN = ?");
         fieldBefore = true;
      };
      if (adchgs != adchgsSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADCHGS = ?");
         fieldBefore = true;
      };
      if (adentt != adenttSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADENTT = ?");
         fieldBefore = true;
      };
      if (adentd != adentdSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADENTD = ?");
         fieldBefore = true;
      };
      if (adeusr != adeusrSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADEUSR = ?");
         fieldBefore = true;
      };
      if (adchgt != adchgtSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADCHGT = ?");
         fieldBefore = true;
      };
      if (adchgd != adchgdSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADCHGD = ?");
         fieldBefore = true;
      };
      if (adcusr != adcusrSav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADCUSR = ?");
         fieldBefore = true;
      };
      if (adex01 != adex01Sav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADEX01 = ?");
         fieldBefore = true;
      };
      if (adex02 != adex02Sav) {
         if (fieldBefore)
            checkSql = checkSql.concat(",");
         checkSql = checkSql.concat(" ADEX02 = ?");
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

      String checkSql = "select ADSTRN, ADDOCT, ADRCDE, ADJDES, ADRCD2, ADJDE2, ADSNDP, ADSNDN," +
                              " ADCHGS, ADENTT, ADENTD, ADEUSR, ADCHGT, ADCHGD, ADCUSR, ADEX01," +
                              ADEX02" +
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

      String checkSql = "select ADSTRN, ADDOCT, ADRCDE, ADJDES, ADRCD2, ADJDE2, ADSNDP, ADSNDN," +
                              " ADCHGS, ADENTT, ADENTD, ADEUSR, ADCHGT, ADCHGD, ADCUSR, ADEX01," +
                              ADEX02" +
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

      String checkSql = "select ADSTRN, ADDOCT, ADRCDE, ADJDES, ADRCD2, ADJDE2, ADSNDP, ADSNDN," +
                              " ADCHGS, ADENTT, ADENTD, ADEUSR, ADCHGT, ADCHGD, ADCUSR, ADEX01," +
                              ADEX02" +
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

      String checkSql = "select ADSTRN, ADDOCT, ADRCDE, ADJDES, ADRCD2, ADJDE2, ADSNDP, ADSNDN," +
                              " ADCHGS, ADENTT, ADENTD, ADEUSR, ADCHGT, ADCHGD, ADCUSR, ADEX01," +
                              ADEX02" +
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

      setADstrn(results.getInt("ADSTRN"));
      setADstrnSav();
      setADdoct(results.getString("ADDOCT"));
      setADdoctSav();
      setADrcde(results.getString("ADRCDE"));
      setADrcdeSav();
      setADjdes(results.getString("ADJDES"));
      setADjdesSav();
      setADrcd2(results.getString("ADRCD2"));
      setADrcd2Sav();
      setADjde2(results.getString("ADJDE2"));
      setADjde2Sav();
      setADsndp(results.getString("ADSNDP"));
      setADsndpSav();
      setADsndn(results.getString("ADSNDN"));
      setADsndnSav();
      setADchgs(results.getString("ADCHGS"));
      setADchgsSav();
      setADentt(results.getInt("ADENTT"));
      setADenttSav();
      setADentd(results.getInt("ADENTD"));
      setADentdSav();
      setADeusr(results.getInt("ADEUSR"));
      setADeusrSav();
      setADchgt(results.getInt("ADCHGT"));
      setADchgtSav();
      setADchgd(results.getInt("ADCHGD"));
      setADchgdSav();
      setADcusr(results.getInt("ADCUSR"));
      setADcusrSav();
      setADex01(results.getString("ADEX01"));
      setADex01Sav();
      setADex02(results.getString("ADEX02"));
      setADex02Sav();

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
