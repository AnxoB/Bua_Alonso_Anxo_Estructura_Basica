import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LayoutSwingConMargenes extends JFrame {

    public LayoutSwingConMargenes() {
        setTitle("Maquetación con márgenes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5); // margen entre bloques principales

        // -------- HEADER PRINCIPAL (10%) --------
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(new Color(205, 92, 92)); 
        JLabel headerLabel = new JLabel("<Header>", SwingConstants.CENTER);
        headerLabel.setForeground(Color.WHITE);
        header.add(headerLabel, BorderLayout.CENTER);
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.weightx = 1; gbc.weighty = 0.1;
        add(header, gbc);

        // -------- NAV (10% ancho) --------
        JPanel nav = new JPanel(new BorderLayout());
        nav.setBackground(new Color(205, 92, 92));
        JLabel navLabel = new JLabel("<Nav>", SwingConstants.CENTER);
        navLabel.setForeground(Color.WHITE);
        nav.add(navLabel, BorderLayout.CENTER);
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.1; gbc.weighty = 0.8;
        add(nav, gbc);

        // -------- SECTION (80% ancho, subdividido) --------
        JPanel section = new JPanel(new GridBagLayout());
        section.setBackground(new Color(205, 92, 92));
        section.setBorder(new EmptyBorder(5, 5, 5, 5)); // margen interno
        GridBagConstraints sec = new GridBagConstraints();
        sec.fill = GridBagConstraints.BOTH;
        sec.insets = new Insets(5, 0, 5, 0); // separación vertical

        // Texto "<Section>"
        JLabel sectionLabel = new JLabel("<Section>", SwingConstants.CENTER);
        sectionLabel.setForeground(Color.WHITE);
        sec.gridx = 0; sec.gridy = 0;
        sec.weightx = 1; sec.weighty = 0.05;
        section.add(sectionLabel, sec);

        // Sub-header (10%)
        JPanel subHeader = new JPanel(new BorderLayout());
        subHeader.setBackground(new Color(189, 183, 107)); 
        JLabel subHeaderLabel = new JLabel("<Header>", SwingConstants.CENTER);
        subHeaderLabel.setForeground(Color.WHITE);
        subHeader.add(subHeaderLabel, BorderLayout.CENTER);
        sec.gridx = 0; sec.gridy = 1;
        sec.weightx = 1; sec.weighty = 0.1;
        section.add(subHeader, sec);

        // Article (70%)
        JPanel article = new JPanel(new BorderLayout());
        article.setBackground(new Color(189, 183, 107));
        JLabel articleLabel = new JLabel("<Article>", SwingConstants.CENTER);
        articleLabel.setForeground(Color.WHITE);
        article.add(articleLabel, BorderLayout.CENTER);
        sec.gridx = 0; sec.gridy = 2;
        sec.weightx = 1; sec.weighty = 0.7;
        section.add(article, sec);

        // Sub-footer (10%)
        JPanel subFooter = new JPanel(new BorderLayout());
        subFooter.setBackground(new Color(189, 183, 107));
        JLabel subFooterLabel = new JLabel("<Footer>", SwingConstants.CENTER);
        subFooterLabel.setForeground(Color.WHITE);
        subFooter.add(subFooterLabel, BorderLayout.CENTER);
        sec.gridx = 0; sec.gridy = 3;
        sec.weightx = 1; sec.weighty = 0.1;
        section.add(subFooter, sec);

        gbc.gridx = 1; gbc.gridy = 1;
        gbc.weightx = 0.8; gbc.weighty = 0.8;
        add(section, gbc);

        // -------- ASIDE (10% ancho) --------
        JPanel aside = new JPanel(new BorderLayout());
        aside.setBackground(new Color(205, 92, 92));
        JLabel asideLabel = new JLabel("<Aside>", SwingConstants.CENTER);
        asideLabel.setForeground(Color.WHITE);
        aside.add(asideLabel, BorderLayout.CENTER);
        gbc.gridx = 2; gbc.gridy = 1;
        gbc.weightx = 0.1; gbc.weighty = 0.8;
        add(aside, gbc);

        // -------- FOOTER PRINCIPAL (10%) --------
        JPanel footer = new JPanel(new BorderLayout());
        footer.setBackground(new Color(205, 92, 92));
        JLabel footerLabel = new JLabel("<Footer>", SwingConstants.CENTER);
        footerLabel.setForeground(Color.WHITE);
        footer.add(footerLabel, BorderLayout.CENTER);
        gbc.gridx = 0; gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.weightx = 1; gbc.weighty = 0.1;
        add(footer, gbc);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LayoutSwingConMargenes::new);
    }
}
