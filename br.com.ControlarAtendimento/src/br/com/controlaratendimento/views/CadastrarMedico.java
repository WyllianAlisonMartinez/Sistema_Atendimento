/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.controlaratendimento.views;

import br.com.controlaratendimento.models.Medico;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;

/**
 *
 * @author wyllm
 */
public class CadastrarMedico extends javax.swing.JFrame {

    public JComboBox<String> getCidadeMedico() {
        return cidadeMedico;
    }

    public static Medico m = new Medico();
    
    public CadastrarMedico() {
        initComponents();
        setSize(700, 475);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        nomeMedico = new javax.swing.JTextField();
        codMedico = new javax.swing.JTextField();
        cpfMedico = new javax.swing.JTextField();
        rgMedico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telefoneMedico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cepMedico = new javax.swing.JTextField();
        enderecoMedico = new javax.swing.JTextField();
        bairroMedico = new javax.swing.JTextField();
        complementoMedico = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cidadeMedico = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        crmMedico = new javax.swing.JTextField();
        especializacaoMedico = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setText("C??digo:*");

        jLabel3.setText("Nome:");

        jLabel4.setText("CPF:");

        jLabel5.setText("RG:");

        jLabel6.setText("Telefone:");

        jLabel7.setText("CEP:");

        jLabel8.setText("Endere??o:");

        cidadeMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abadia de Goi??s (GO)", "Abadia dos Dourados (MG)", "Abadi??nia (GO)", "Abaet?? (MG)", "Abaetetuba (PA)", "Abaiara (CE)", "Aba??ra (BA)", "Abar?? (BA)", "Abati?? (PR)", "Abdon Batista (SC)", "Abelardo Luz (SC)", "Abel Figueiredo (PA)", "Abre Campo (MG)", "Abreu e Lima (PE)", "Abreul??ndia (TO)", "Acaiaca (MG)", "A??ail??ndia (MA)", "Acajutiba (BA)", "Acar?? (PA)", "Acarape (CE)", "Acara?? (CE)", "Acari (RN)", "Acau?? (PI)", "Acegu?? (RS)", "Acopiara (CE)", "Acorizal (MT)", "Acrel??ndia (AC)", "Acre??na (GO)", "A??ucena (MG)", "Adamantina (SP)", "Adel??ndia (GO)", "Adolfo (SP)", "Adrian??polis (PR)", "Adustina (BA)", "Afogados da Ingazeira (PE)", "Afonso Bezerra (RN)", "Afonso Cl??udio (ES)", "Afonso Cunha (MA)", "Afr??nio (PE)", "Afu?? (PA)", "Agrestina (PE)", "Agricol??ndia (PI)", "Agrol??ndia (SC)", "Agron??mica (SC)", "??gua Azul do Norte (PA)", "??gua Boa (MG)", "??gua Boa (MT)", "??gua Branca (AL)", "??gua Branca (PB)", "??gua Branca (PI)", "??gua Clara (MS)", "??gua Comprida (MG)", "??gua Doce (SC)", "??gua Doce do Maranh??o (MA)", "??gua Doce do Norte (ES)", "??gua Fria (BA)", "??gua Fria de Goi??s (GO)", "Agua?? (SP)", "??gua Limpa (GO)", "Aguanil (MG)", "??gua Nova (RN)", "??gua Preta (PE)", "??gua Santa (RS)", "??guas Belas (PE)", "??guas da Prata (SP)", "??guas de Chapec?? (SC)", "??guas de Lind??ia (SP)", "??guas de Santa B??rbara (SP)", "??guas de S??o Pedro (SP)", "??guas Formosas (MG)", "??guas Frias (SC)", "??guas Lindas de Goi??s (GO)", "??guas Mornas (SC)", "??guas Vermelhas (MG)", "Agudo (RS)", "Agudos (SP)", "Agudos do Sul (PR)", "??guia Branca (ES)", "Aguiar (PB)", "Aguiarn??polis (TO)", "Aimor??s (MG)", "Aiquara (BA)", "Aiuaba (CE)", "Aiuruoca (MG)", "Ajuricaba (RS)", "Alagoa (MG)", "Alagoa Grande (PB)", "Alagoa Nova (PB)", "Alagoinha (PB)", "Alagoinha (PE)", "Alagoinha do Piau?? (PI)", "Alagoinhas (BA)", "Alambari (SP)", "Albertina (MG)", "Alc??ntara (MA)", "Alc??ntaras (CE)", "Alcantil (PB)", "Alcin??polis (MS)", "Alcoba??a (BA)", "Aldeias Altas (MA)", "Alecrim (RS)", "Alegre (ES)", "Alegrete (RS)", "Alegrete do Piau?? (PI)", "Alegria (RS)", "Al??m Para??ba (MG)", "Alenquer (PA)", "Alexandria (RN)", "Alex??nia (GO)", "Alfenas (MG)", "Alfredo Chaves (ES)", "Alfredo Marcondes (SP)", "Alfredo Vasconcelos (MG)", "Alfredo Wagner (SC)", "Algod??o de Janda??ra (PB)", "Alhandra (PB)", "Alian??a (PE)", "Alian??a do Tocantins (TO)", "Almadina (BA)", "Almas (TO)", "Almenara (MG)", "Almeirim (PA)", "Almino Afonso (RN)", "Almirante Tamandar?? (PR)", "Almirante Tamandar?? do Sul (RS)", "Alo??ndia (GO)", "Alpercata (MG)", "Alpestre (RS)", "Alpin??polis (MG)", "Alta Floresta (MT)", "Alta Floresta d'Oeste (RO)", "Altair (SP)", "Altamira (PA)", "Altamira do Maranh??o (MA)", "Altamira do Paran?? (PR)", "Altaneira (CE)", "Alterosa (MG)", "Altinho (PE)", "Altin??polis (SP)", "Alto Alegre (RR)", "Alto Alegre (RS)", "Alto Alegre (SP)", "Alto Alegre do Maranh??o (MA)", "Alto Alegre do Pindar?? (MA)", "Alto Alegre dos Parecis (RO)", "Alto Araguaia (MT)", "Alto Bela Vista (SC)", "Alto Capara?? (MG)", "Alto da Boa Vista (MT)", "Alto do Rodrigues (RN)", "Alto Feliz (RS)", "Alto Gar??as (MT)", "Alto Horizonte (GO)", "Alto Jequitib?? (MG)", "Alto Long?? (PI)", "Alt??nia (PR)", "Alto Paraguai (MT)", "Alto Para??so (PR)", "Alto Para??so (RO)", "Alto Para??so de Goi??s (GO)", "Alto Paran?? (PR)", "Alto Parna??ba (MA)", "Alto Piquiri (PR)", "Alto Rio Doce (MG)", "Alto Rio Novo (ES)", "Altos (PI)", "Alto Santo (CE)", "Alto Taquari (MT)", "Alum??nio (SP)", "Alvar??es (AM)", "Alvarenga (MG)", "??lvares Florence (SP)", "??lvares Machado (SP)", "??lvaro de Carvalho (SP)", "Alvinl??ndia (SP)", "Alvin??polis (MG)", "Alvorada (RS)", "Alvorada (TO)", "Alvorada de Minas (MG)", "Alvorada d'Oeste (RO)", "Alvorada do Gurgueia (PI)", "Alvorada do Norte (GO)", "Alvorada do Sul (PR)", "Amajari (RR)", "Amambai (MS)", "Amap?? (AP)", "Amap?? do Maranh??o (MA)", "Amapor?? (PR)", "Amaraji (PE)", "Amaral Ferrador (RS)", "Amaralina (GO)", "Amarante (PI)", "Amarante do Maranh??o (MA)", "Amargosa (BA)", "Amatur?? (AM)", "Am??lia Rodrigues (BA)", "Am??rica Dourada (BA)", "Americana (SP)", "Americano do Brasil (GO)", "Am??rico Brasiliense (SP)", "Am??rico de Campos (SP)", "Ametista do Sul (RS)", "Amontada (CE)", "Amorin??polis (GO)", "Amparo (PB)", "Amparo (SP)", "Amparo da Serra (MG)", "Amparo do S??o Francisco (SE)", "Amp??re (PR)", "Anadia (AL)", "Anag?? (BA)", "Anahy (PR)", "Anaj??s (PA)", "Anajatuba (MA)", "Anal??ndia (SP)", "Anam?? (AM)", "Anan??s (TO)", "Ananindeua (PA)", "An??polis (GO)", "Anapu (PA)", "Anapurus (MA)", "Anast??cio (MS)", "Anauril??ndia (MS)", "Anchieta (ES)", "Anchieta (SC)", "Andara?? (BA)", "Andir?? (PR)", "Andorinha (BA)", "Andradas (MG)", "Andradina (SP)", "Andr?? da Rocha (RS)", "Andrel??ndia (MG)", "Angatuba (SP)", "Angel??ndia (MG)", "Ang??lica (MS)", "Angelim (PE)", "Angelina (SC)", "Angical (BA)", "Angical do Piau?? (PI)", "Angico (TO)", "Angicos (RN)", "Angra dos Reis (RJ)", "Anguera (BA)", "??ngulo (PR)", "Anhanguera (GO)", "Anhembi (SP)", "Anhumas (SP)", "Anicuns (GO)", "An??sio de Abreu (PI)", "Anita Garibaldi (SC)", "Anit??polis (SC)", "Anori (AM)", "Anta Gorda (RS)", "Antas (BA)", "Antonina (PR)", "Antonina do Norte (CE)", "Ant??nio Almeida (PI)", "Ant??nio Cardoso (BA)", "Ant??nio Carlos (MG)", "Ant??nio Carlos (SC)", "Ant??nio Dias (MG)", "Ant??nio Gon??alves (BA)", "Ant??nio Jo??o (MS)", "Ant??nio Martins (RN)", "Ant??nio Olinto (PR)", "Ant??nio Prado (RS)", "Ant??nio Prado de Minas (MG)", "Aparecida (PB)", "Aparecida (SP)", "Aparecida de Goi??nia (GO)", "Aparecida d'Oeste (SP)", "Aparecida do Rio Doce (GO)", "Aparecida do Rio Negro (TO)", "Aparecida do Taboado (MS)", "Aperib?? (RJ)", "Apiac?? (ES)", "Apiac??s (MT)", "Apia?? (SP)", "Apicum-A??u (MA)", "Api??na (SC)", "Apodi (RN)", "Apor?? (BA)", "Apor?? (GO)", "Apuarema (BA)", "Apucarana (PR)", "Apu?? (AM)", "Apuiar??s (CE)", "Aquidab?? (SE)", "Aquidauana (MS)", "Aquiraz (CE)", "Arabut?? (SC)", "Ara??agi (PB)", "Ara??a?? (MG)", "Aracaju (SE)", "Ara??ariguama (SP)", "Ara????s (BA)", "Aracati (CE)", "Aracatu (BA)", "Ara??atuba (SP)", "Araci (BA)", "Aracitaba (MG)", "Aracoiaba (CE)", "Ara??oiaba (PE)", "Ara??oiaba da Serra (SP)", "Aracruz (ES)", "Ara??u (GO)", "Ara??ua?? (MG)", "Aragar??as (GO)", "Aragoi??nia (GO)", "Aragominas (TO)", "Araguacema (TO)", "Aragua??u (TO)", "Araguaiana (MT)", "Aragua??na (TO)", "Araguainha (MT)", "Araguan?? (MA)", "Araguan?? (TO)", "Araguapaz (GO)", "Araguari (MG)", "Araguatins (TO)", "Araioses (MA)", "Aral Moreira (MS)", "Aramari (BA)", "Arambar?? (RS)", "Arame (MA)", "Aramina (SP)", "Arandu (SP)", "Arantina (MG)", "Arape?? (SP)", "Arapiraca (AL)", "Arapoema (TO)", "Araponga (MG)", "Arapongas (PR)", "Arapor?? (MG)", "Arapoti (PR)", "Arapu?? (MG)", "Arapu?? (PR)", "Araputanga (MT)", "Araquari (SC)", "Arara (PB)", "Ararangu?? (SC)", "Araraquara (SP)", "Araras (SP)", "Ararend?? (CE)", "Arari (MA)", "Araric?? (RS)", "Araripe (CE)", "Araripina (PE)", "Araruama (RJ)", "Araruna (PB)", "Araruna (PR)", "Arataca (BA)", "Aratiba (RS)", "Aratuba (CE)", "Aratu??pe (BA)", "Arau?? (SE)", "Arauc??ria (PR)", "Ara??jos (MG)", "Arax?? (MG)", "Arceburgo (MG)", "Arco-??ris (SP)", "Arcos (MG)", "Arcoverde (PE)", "Areado (MG)", "Areal (RJ)", "Arealva (SP)", "Areia (PB)", "Areia Branca (RN)", "Areia Branca (SE)", "Areia de Bara??nas (PB)", "Areial (PB)", "Areias (SP)", "Arei??polis (SP)", "Aren??polis (MT)", "Aren??polis (GO)", "Arez (Rio Grande do Norte) (RN)", "Argirita (MG)", "Aricanduva (MG)", "Arinos (MG)", "Aripuan?? (MT)", "Ariquemes (RO)", "Ariranha (SP)", "Ariranha do Iva?? (PR)", "Arma????o dos B??zios (RJ)", "Armaz??m (SC)", "Arneiroz (CE)", "Aroazes (PI)", "Aroeiras (PB)", "Aroeiras do Itaim (PI)", "Arraial (PI)", "Arraial do Cabo (RJ)", "Arraias (TO)", "Arroio do Meio (RS)", "Arroio do Padre (RS)", "Arroio do Sal (RS)", "Arroio dos Ratos (RS)", "Arroio do Tigre (RS)", "Arroio Grande (RS)", "Arroio Trinta (SC)", "Artur Nogueira (SP)", "Aruan?? (GO)", "Aruj?? (SP)", "Arvoredo (SC)", "Arvorezinha (RS)", "Ascurra (SC)", "Asp??sia (SP)", "Assa?? (PR)", "Assar?? (CE)", "Assis (SP)", "Assis Brasil (AC)", "Assis Chateaubriand (PR)", "Assu (RN)", "Assun????o do Piau?? (PI)", "Assun????o (PB)", "Astolfo Dutra (MG)", "Astorga (PR)", "Atalaia (AL)", "Atalaia (PR)", "Atalaia do Norte (AM)", "Atalanta (SC)", "Atal??ia (MG)", "Atibaia (SP)", "At??lio Viv??cqua (ES)", "Augustin??polis (TO)", "Augusto Corr??a (PA)", "Augusto de Lima (MG)", "Augusto Pestana (RS)", "??urea (RS)", "Aurelino Leal (BA)", "Auriflama (SP)", "Auril??ndia (GO)", "Aurora (CE)", "Aurora (SC)", "Aurora do Par?? (PA)", "Aurora do Tocantins (TO)", "Autazes (AM)", "Ava?? (SP)", "Avanhandava (SP)", "Avar?? (SP)", "Aveiro (PA)", "Avelino Lopes (PI)", "Avelin??polis (GO)", "Axix?? (MA)", "Axix?? do Tocantins (TO)", " " }));

        jLabel9.setText("Cidade:");

        jLabel10.setText("Bairro:");

        jLabel11.setText("Complemento:");

        jLabel12.setText("CRM:");

        jLabel13.setText("Especialidade:");

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Salvar");
        jButton1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton1InputMethodTextChanged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Cancelar");
        jButton2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton2InputMethodTextChanged(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Campos com * s??o obrigat??rios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(especializacaoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cidadeMedico, 0, 1, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(telefoneMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(complementoMedico))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(nomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rgMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(crmMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cepMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bairroMedico)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(enderecoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(codMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cpfMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cepMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(crmMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(enderecoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(bairroMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(complementoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especializacaoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(cidadeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar M??dico ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void SalvarCadastroMedico(){
          Medico nvMedico = new Medico();

        if ("".equals(codMedico.getText())) {
            JOptionPane.showMessageDialog(this, "H?? Campos obrigat??rios Vazios");
        } else {
            nvMedico.setId(Integer.parseInt(codMedico.getText()));
            nvMedico.setNome(nomeMedico.getText());
            nvMedico.setCpf(cpfMedico.getText());
            nvMedico.setRg(rgMedico.getText());
            nvMedico.setTelefone(telefoneMedico.getText());
            nvMedico.setEspecializacao(especializacaoMedico.getText());
            nvMedico.setCrm(crmMedico.getText());
            nvMedico.setCep(cepMedico.getText());
            nvMedico.setEndereco(enderecoMedico.getText());
            nvMedico.setBairro(bairroMedico.getText());
            nvMedico.setComplemento(complementoMedico.getText());
            nvMedico.setCidade(cidadeMedico.getSelectedIndex());
            

            m.getListagemMedico().add(nvMedico);

            JOptionPane.showMessageDialog(this, "Salvo com sucesso");
            
            codMedico.setText("1");
            nomeMedico.setText("");
            cpfMedico.setText("");
            rgMedico.setText("");
            telefoneMedico.setText("");
            especializacaoMedico.setText("");
            crmMedico.setText("");
            cepMedico.setText("");
            enderecoMedico.setText("");
            bairroMedico.setText("");
            complementoMedico.setText("");
            
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        SalvarCadastroMedico();
        
        
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
          if( "F6" == KeyEvent.getKeyText( evt.getKeyCode() ) ){
            SalvarCadastroMedico();
        }
        
        
      
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton1InputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1InputMethodTextChanged

    private void jButton2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton2InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2InputMethodTextChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        codMedico.setText("");
            nomeMedico.setText("");
            cpfMedico.setText("");
            rgMedico.setText("");
            telefoneMedico.setText("");
            especializacaoMedico.setText("");
            crmMedico.setText("");
            cepMedico.setText("");
            enderecoMedico.setText("");
            bairroMedico.setText("");
            complementoMedico.setText("");
            
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarMedico().setVisible(true);
                
            }
        });
        
     
       
       

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroMedico;
    private javax.swing.JTextField cepMedico;
    private javax.swing.JComboBox<String> cidadeMedico;
    private javax.swing.JTextField codMedico;
    private javax.swing.JTextField complementoMedico;
    private javax.swing.JTextField cpfMedico;
    private javax.swing.JTextField crmMedico;
    private javax.swing.JTextField enderecoMedico;
    private javax.swing.JTextField especializacaoMedico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField nomeMedico;
    private javax.swing.JTextField rgMedico;
    private javax.swing.JTextField telefoneMedico;
    // End of variables declaration//GEN-END:variables
}
