/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.controlaratendimento.views;


import br.com.controlaratendimento.models.Paciente;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author wyllm
 */
public class CadastrarPaciente extends javax.swing.JFrame {

    public JComboBox<String> getCidadePaciente() {
        return cidadePaciente;
    }

    public static Paciente p = new Paciente();

    public CadastrarPaciente() {
        initComponents();
        setSize(700, 475);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public Object getObjP() {
        return p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        telefonePaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cepPaciente = new javax.swing.JTextField();
        nomePaciente = new javax.swing.JTextField();
        enderecoPaciente = new javax.swing.JTextField();
        codPaciente = new javax.swing.JTextField();
        bairroPaciente = new javax.swing.JTextField();
        cpfPaciente = new javax.swing.JTextField();
        complementoPaciente = new javax.swing.JTextField();
        rgPaciente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cidadePaciente = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        idadePaciente = new javax.swing.JTextField();
        salvarPaciente = new javax.swing.JButton();
        cancelarPaciente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar Paciente ");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setText("CPF:");

        jLabel9.setText("Cidade:");

        jLabel5.setText("RG:");

        jLabel10.setText("Bairro:");

        jLabel11.setText("Complemento:");

        jLabel6.setText("Telefone:");

        enderecoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoPacienteActionPerformed(evt);
            }
        });

        jLabel7.setText("CEP:");

        jLabel2.setText("C??digo:*");

        jLabel8.setText("Endere??o:");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");

        cidadePaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abadia de Goi??s (GO)", "Abadia dos Dourados (MG)", "Abadi??nia (GO)", "Abaet?? (MG)", "Abaetetuba (PA)", "Abaiara (CE)", "Aba??ra (BA)", "Abar?? (BA)", "Abati?? (PR)", "Abdon Batista (SC)", "Abelardo Luz (SC)", "Abel Figueiredo (PA)", "Abre Campo (MG)", "Abreu e Lima (PE)", "Abreul??ndia (TO)", "Acaiaca (MG)", "A??ail??ndia (MA)", "Acajutiba (BA)", "Acar?? (PA)", "Acarape (CE)", "Acara?? (CE)", "Acari (RN)", "Acau?? (PI)", "Acegu?? (RS)", "Acopiara (CE)", "Acorizal (MT)", "Acrel??ndia (AC)", "Acre??na (GO)", "A??ucena (MG)", "Adamantina (SP)", "Adel??ndia (GO)", "Adolfo (SP)", "Adrian??polis (PR)", "Adustina (BA)", "Afogados da Ingazeira (PE)", "Afonso Bezerra (RN)", "Afonso Cl??udio (ES)", "Afonso Cunha (MA)", "Afr??nio (PE)", "Afu?? (PA)", "Agrestina (PE)", "Agricol??ndia (PI)", "Agrol??ndia (SC)", "Agron??mica (SC)", "??gua Azul do Norte (PA)", "??gua Boa (MG)", "??gua Boa (MT)", "??gua Branca (AL)", "??gua Branca (PB)", "??gua Branca (PI)", "??gua Clara (MS)", "??gua Comprida (MG)", "??gua Doce (SC)", "??gua Doce do Maranh??o (MA)", "??gua Doce do Norte (ES)", "??gua Fria (BA)", "??gua Fria de Goi??s (GO)", "Agua?? (SP)", "??gua Limpa (GO)", "Aguanil (MG)", "??gua Nova (RN)", "??gua Preta (PE)", "??gua Santa (RS)", "??guas Belas (PE)", "??guas da Prata (SP)", "??guas de Chapec?? (SC)", "??guas de Lind??ia (SP)", "??guas de Santa B??rbara (SP)", "??guas de S??o Pedro (SP)", "??guas Formosas (MG)", "??guas Frias (SC)", "??guas Lindas de Goi??s (GO)", "??guas Mornas (SC)", "??guas Vermelhas (MG)", "Agudo (RS)", "Agudos (SP)", "Agudos do Sul (PR)", "??guia Branca (ES)", "Aguiar (PB)", "Aguiarn??polis (TO)", "Aimor??s (MG)", "Aiquara (BA)", "Aiuaba (CE)", "Aiuruoca (MG)", "Ajuricaba (RS)", "Alagoa (MG)", "Alagoa Grande (PB)", "Alagoa Nova (PB)", "Alagoinha (PB)", "Alagoinha (PE)", "Alagoinha do Piau?? (PI)", "Alagoinhas (BA)", "Alambari (SP)", "Albertina (MG)", "Alc??ntara (MA)", "Alc??ntaras (CE)", "Alcantil (PB)", "Alcin??polis (MS)", "Alcoba??a (BA)", "Aldeias Altas (MA)", "Alecrim (RS)", "Alegre (ES)", "Alegrete (RS)", "Alegrete do Piau?? (PI)", "Alegria (RS)", "Al??m Para??ba (MG)", "Alenquer (PA)", "Alexandria (RN)", "Alex??nia (GO)", "Alfenas (MG)", "Alfredo Chaves (ES)", "Alfredo Marcondes (SP)", "Alfredo Vasconcelos (MG)", "Alfredo Wagner (SC)", "Algod??o de Janda??ra (PB)", "Alhandra (PB)", "Alian??a (PE)", "Alian??a do Tocantins (TO)", "Almadina (BA)", "Almas (TO)", "Almenara (MG)", "Almeirim (PA)", "Almino Afonso (RN)", "Almirante Tamandar?? (PR)", "Almirante Tamandar?? do Sul (RS)", "Alo??ndia (GO)", "Alpercata (MG)", "Alpestre (RS)", "Alpin??polis (MG)", "Alta Floresta (MT)", "Alta Floresta d'Oeste (RO)", "Altair (SP)", "Altamira (PA)", "Altamira do Maranh??o (MA)", "Altamira do Paran?? (PR)", "Altaneira (CE)", "Alterosa (MG)", "Altinho (PE)", "Altin??polis (SP)", "Alto Alegre (RR)", "Alto Alegre (RS)", "Alto Alegre (SP)", "Alto Alegre do Maranh??o (MA)", "Alto Alegre do Pindar?? (MA)", "Alto Alegre dos Parecis (RO)", "Alto Araguaia (MT)", "Alto Bela Vista (SC)", "Alto Capara?? (MG)", "Alto da Boa Vista (MT)", "Alto do Rodrigues (RN)", "Alto Feliz (RS)", "Alto Gar??as (MT)", "Alto Horizonte (GO)", "Alto Jequitib?? (MG)", "Alto Long?? (PI)", "Alt??nia (PR)", "Alto Paraguai (MT)", "Alto Para??so (PR)", "Alto Para??so (RO)", "Alto Para??so de Goi??s (GO)", "Alto Paran?? (PR)", "Alto Parna??ba (MA)", "Alto Piquiri (PR)", "Alto Rio Doce (MG)", "Alto Rio Novo (ES)", "Altos (PI)", "Alto Santo (CE)", "Alto Taquari (MT)", "Alum??nio (SP)", "Alvar??es (AM)", "Alvarenga (MG)", "??lvares Florence (SP)", "??lvares Machado (SP)", "??lvaro de Carvalho (SP)", "Alvinl??ndia (SP)", "Alvin??polis (MG)", "Alvorada (RS)", "Alvorada (TO)", "Alvorada de Minas (MG)", "Alvorada d'Oeste (RO)", "Alvorada do Gurgueia (PI)", "Alvorada do Norte (GO)", "Alvorada do Sul (PR)", "Amajari (RR)", "Amambai (MS)", "Amap?? (AP)", "Amap?? do Maranh??o (MA)", "Amapor?? (PR)", "Amaraji (PE)", "Amaral Ferrador (RS)", "Amaralina (GO)", "Amarante (PI)", "Amarante do Maranh??o (MA)", "Amargosa (BA)", "Amatur?? (AM)", "Am??lia Rodrigues (BA)", "Am??rica Dourada (BA)", "Americana (SP)", "Americano do Brasil (GO)", "Am??rico Brasiliense (SP)", "Am??rico de Campos (SP)", "Ametista do Sul (RS)", "Amontada (CE)", "Amorin??polis (GO)", "Amparo (PB)", "Amparo (SP)", "Amparo da Serra (MG)", "Amparo do S??o Francisco (SE)", "Amp??re (PR)", "Anadia (AL)", "Anag?? (BA)", "Anahy (PR)", "Anaj??s (PA)", "Anajatuba (MA)", "Anal??ndia (SP)", "Anam?? (AM)", "Anan??s (TO)", "Ananindeua (PA)", "An??polis (GO)", "Anapu (PA)", "Anapurus (MA)", "Anast??cio (MS)", "Anauril??ndia (MS)", "Anchieta (ES)", "Anchieta (SC)", "Andara?? (BA)", "Andir?? (PR)", "Andorinha (BA)", "Andradas (MG)", "Andradina (SP)", "Andr?? da Rocha (RS)", "Andrel??ndia (MG)", "Angatuba (SP)", "Angel??ndia (MG)", "Ang??lica (MS)", "Angelim (PE)", "Angelina (SC)", "Angical (BA)", "Angical do Piau?? (PI)", "Angico (TO)", "Angicos (RN)", "Angra dos Reis (RJ)", "Anguera (BA)", "??ngulo (PR)", "Anhanguera (GO)", "Anhembi (SP)", "Anhumas (SP)", "Anicuns (GO)", "An??sio de Abreu (PI)", "Anita Garibaldi (SC)", "Anit??polis (SC)", "Anori (AM)", "Anta Gorda (RS)", "Antas (BA)", "Antonina (PR)", "Antonina do Norte (CE)", "Ant??nio Almeida (PI)", "Ant??nio Cardoso (BA)", "Ant??nio Carlos (MG)", "Ant??nio Carlos (SC)", "Ant??nio Dias (MG)", "Ant??nio Gon??alves (BA)", "Ant??nio Jo??o (MS)", "Ant??nio Martins (RN)", "Ant??nio Olinto (PR)", "Ant??nio Prado (RS)", "Ant??nio Prado de Minas (MG)", "Aparecida (PB)", "Aparecida (SP)", "Aparecida de Goi??nia (GO)", "Aparecida d'Oeste (SP)", "Aparecida do Rio Doce (GO)", "Aparecida do Rio Negro (TO)", "Aparecida do Taboado (MS)", "Aperib?? (RJ)", "Apiac?? (ES)", "Apiac??s (MT)", "Apia?? (SP)", "Apicum-A??u (MA)", "Api??na (SC)", "Apodi (RN)", "Apor?? (BA)", "Apor?? (GO)", "Apuarema (BA)", "Apucarana (PR)", "Apu?? (AM)", "Apuiar??s (CE)", "Aquidab?? (SE)", "Aquidauana (MS)", "Aquiraz (CE)", "Arabut?? (SC)", "Ara??agi (PB)", "Ara??a?? (MG)", "Aracaju (SE)", "Ara??ariguama (SP)", "Ara????s (BA)", "Aracati (CE)", "Aracatu (BA)", "Ara??atuba (SP)", "Araci (BA)", "Aracitaba (MG)", "Aracoiaba (CE)", "Ara??oiaba (PE)", "Ara??oiaba da Serra (SP)", "Aracruz (ES)", "Ara??u (GO)", "Ara??ua?? (MG)", "Aragar??as (GO)", "Aragoi??nia (GO)", "Aragominas (TO)", "Araguacema (TO)", "Aragua??u (TO)", "Araguaiana (MT)", "Aragua??na (TO)", "Araguainha (MT)", "Araguan?? (MA)", "Araguan?? (TO)", "Araguapaz (GO)", "Araguari (MG)", "Araguatins (TO)", "Araioses (MA)", "Aral Moreira (MS)", "Aramari (BA)", "Arambar?? (RS)", "Arame (MA)", "Aramina (SP)", "Arandu (SP)", "Arantina (MG)", "Arape?? (SP)", "Arapiraca (AL)", "Arapoema (TO)", "Araponga (MG)", "Arapongas (PR)", "Arapor?? (MG)", "Arapoti (PR)", "Arapu?? (MG)", "Arapu?? (PR)", "Araputanga (MT)", "Araquari (SC)", "Arara (PB)", "Ararangu?? (SC)", "Araraquara (SP)", "Araras (SP)", "Ararend?? (CE)", "Arari (MA)", "Araric?? (RS)", "Araripe (CE)", "Araripina (PE)", "Araruama (RJ)", "Araruna (PB)", "Araruna (PR)", "Arataca (BA)", "Aratiba (RS)", "Aratuba (CE)", "Aratu??pe (BA)", "Arau?? (SE)", "Arauc??ria (PR)", "Ara??jos (MG)", "Arax?? (MG)", "Arceburgo (MG)", "Arco-??ris (SP)", "Arcos (MG)", "Arcoverde (PE)", "Areado (MG)", "Areal (RJ)", "Arealva (SP)", "Areia (PB)", "Areia Branca (RN)", "Areia Branca (SE)", "Areia de Bara??nas (PB)", "Areial (PB)", "Areias (SP)", "Arei??polis (SP)", "Aren??polis (MT)", "Aren??polis (GO)", "Arez (Rio Grande do Norte) (RN)", "Argirita (MG)", "Aricanduva (MG)", "Arinos (MG)", "Aripuan?? (MT)", "Ariquemes (RO)", "Ariranha (SP)", "Ariranha do Iva?? (PR)", "Arma????o dos B??zios (RJ)", "Armaz??m (SC)", "Arneiroz (CE)", "Aroazes (PI)", "Aroeiras (PB)", "Aroeiras do Itaim (PI)", "Arraial (PI)", "Arraial do Cabo (RJ)", "Arraias (TO)", "Arroio do Meio (RS)", "Arroio do Padre (RS)", "Arroio do Sal (RS)", "Arroio dos Ratos (RS)", "Arroio do Tigre (RS)", "Arroio Grande (RS)", "Arroio Trinta (SC)", "Artur Nogueira (SP)", "Aruan?? (GO)", "Aruj?? (SP)", "Arvoredo (SC)", "Arvorezinha (RS)", "Ascurra (SC)", "Asp??sia (SP)", "Assa?? (PR)", "Assar?? (CE)", "Assis (SP)", "Assis Brasil (AC)", "Assis Chateaubriand (PR)", "Assu (RN)", "Assun????o do Piau?? (PI)", "Assun????o (PB)", "Astolfo Dutra (MG)", "Astorga (PR)", "Atalaia (AL)", "Atalaia (PR)", "Atalaia do Norte (AM)", "Atalanta (SC)", "Atal??ia (MG)", "Atibaia (SP)", "At??lio Viv??cqua (ES)", "Augustin??polis (TO)", "Augusto Corr??a (PA)", "Augusto de Lima (MG)", "Augusto Pestana (RS)", "??urea (RS)", "Aurelino Leal (BA)", "Auriflama (SP)", "Auril??ndia (GO)", "Aurora (CE)", "Aurora (SC)", "Aurora do Par?? (PA)", "Aurora do Tocantins (TO)", "Autazes (AM)", "Ava?? (SP)", "Avanhandava (SP)", "Avar?? (SP)", "Aveiro (PA)", "Avelino Lopes (PI)", "Avelin??polis (GO)", "Axix?? (MA)", "Axix?? do Tocantins (TO)", " " }));
        cidadePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadePacienteActionPerformed(evt);
            }
        });

        jLabel12.setText("Idade:*");

        idadePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadePacienteActionPerformed(evt);
            }
        });

        salvarPaciente.setBackground(new java.awt.Color(51, 204, 0));
        salvarPaciente.setText("Salvar");
        salvarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarPacienteActionPerformed(evt);
            }
        });

        cancelarPaciente.setBackground(new java.awt.Color(255, 51, 51));
        cancelarPaciente.setText("Cancelar");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Campos com * s??o obrigat??rios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rgPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cpfPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(enderecoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bairroPaciente))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(83, 83, 83)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cidadePaciente, 0, 1, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(cancelarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))))))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(codPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(nomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(salvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(telefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(idadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(126, 126, 126)))
                            .addGap(9, 9, 9)
                            .addComponent(complementoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(complementoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(enderecoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(bairroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(cidadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(196, 196, 196))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idadePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadePacienteActionPerformed

    private void cidadePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadePacienteActionPerformed

    private void enderecoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoPacienteActionPerformed

    private void salvarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarPacienteActionPerformed

        Paciente nvPaciente = new Paciente();

        if ("".equals(idadePaciente.getText()) || "".equals(codPaciente.getText())) {
            JOptionPane.showMessageDialog(this, "H?? Campos obrigat??rios Vazios");
        } else {
            nvPaciente.setId(Integer.parseInt(codPaciente.getText()));
            nvPaciente.setNome(nomePaciente.getText());
            nvPaciente.setCep(cepPaciente.getText());
            nvPaciente.setComplemento(complementoPaciente.getText());
            nvPaciente.setCpf(cpfPaciente.getText());
            nvPaciente.setRg(rgPaciente.getText());
            nvPaciente.setTelefone(telefonePaciente.getText());
            nvPaciente.setIdade(Integer.parseInt(idadePaciente.getText()));
            nvPaciente.setEndereco(enderecoPaciente.getText());
            nvPaciente.setBairro(bairroPaciente.getText());
            nvPaciente.setCidade(cidadePaciente.getSelectedIndex());

            p.getListagemPaciente().add(nvPaciente);

            JOptionPane.showMessageDialog(this, "Salvo com sucesso");

            codPaciente.setText("");
            nomePaciente.setText("");
            cepPaciente.setText("");
            complementoPaciente.setText("");
            cpfPaciente.setText("");
            rgPaciente.setText("");
            telefonePaciente.setText("");
            idadePaciente.setText("");
            enderecoPaciente.setText("");
            bairroPaciente.setText("");
        }
    }//GEN-LAST:event_salvarPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroPaciente;
    private javax.swing.JButton cancelarPaciente;
    private javax.swing.JTextField cepPaciente;
    private javax.swing.JComboBox<String> cidadePaciente;
    private javax.swing.JTextField codPaciente;
    private javax.swing.JTextField complementoPaciente;
    private javax.swing.JTextField cpfPaciente;
    private javax.swing.JTextField enderecoPaciente;
    private javax.swing.JTextField idadePaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField nomePaciente;
    private javax.swing.JTextField rgPaciente;
    private javax.swing.JButton salvarPaciente;
    private javax.swing.JTextField telefonePaciente;
    // End of variables declaration//GEN-END:variables
}
