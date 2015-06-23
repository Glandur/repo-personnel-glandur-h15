<!-- 
 *  Devoir AJAX et J2EE, par Eric Boivin
 *  Cette page est un fragment et doît être populé après un appel
 *  du servlet et le Bean Photo approprié. Elle présente la fiche de 
 *  détails d'une Photo pour en faire l'aperçu ou la commande. 
 /-->
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page import="ca.etsmtl.gti525.devoir1.Photo"%>
<%
Photo laPhoto = (Photo)request.getAttribute("photo");
String chemin = request.getAttribute("dossierVignettes")+"/"+laPhoto.getChemin();
%>
<!DOCTYPE html>
<html>
    <body>
        <table>
            <tr>
                <td align="center">
                    <h2><%=laPhoto.getTitre()%></h2>
                </td>
            </tr>
            <tr>
                <td>
                    <img src="<%=chemin%>">
                </td>
            </tr>
             <tr>
                <td align="center">
                    <h2><a href="watermark/<%=chemin%>" target="_blank">Aperçu de cette image</a></h2>
                    <br/>
                    <form name="payer" action="watermark/<%=chemin%>" method="post">
                        Carte de crédit <input type="text" name="carteCredit" />
                        <br/>
                       <input type="submit" value="Acheter cette image" />
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>
